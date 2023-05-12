package com.re.wanderlust.core.services.impl;

import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import com.day.cq.wcm.api.Page;
import com.re.wanderlust.core.exception.REWException;
import com.re.wanderlust.core.services.QueryService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.factory.InvalidAdaptableException;
import org.apache.sling.models.factory.MissingElementsException;
import org.apache.sling.models.factory.ModelFactory;
import org.apache.sling.models.factory.ValidationException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents a Query Service Implementation.
 * used for <b>RE Wanderlust</b> project implementation
 *
 * @version 1.0
 * @since 1.0
 */
@Component(service = QueryService.class, immediate = true, enabled = true)
public class QueryServiceImpl implements QueryService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference
    private QueryBuilder queryBuilder;
    @Reference
    private ModelFactory modelFactory;

    private <T> T adaptToSlingModel(final Class<? extends T> slingModelClz,
                                    final List<T> resultList,
                                    final Resource resource) {
        try {
            final T t = modelFactory.createModel(resource, slingModelClz);
            if (logger.isDebugEnabled()) {
                logger.debug("Adapting to ::: {}", t);
            }
            resultList.add(t);
            return t;
        } catch (MissingElementsException
                | ValidationException
                | InvalidAdaptableException e) {
            logger.error("unable to create a model", e);
        }
        return null;
    }

    @Override
    public <T> QueryResult<T> find(final ResourceResolver resolver,
                                   final Session session,
                                   final Map<String, String> predicateMap,
                                   final Class<T> slingModelClz)
            throws REWException {
        final QueryResult<T> result = new QueryResult<>();
        final List<T> resultList = new ArrayList<>();

        if (predicateMap == null || predicateMap.isEmpty()) {
            result.setSuccess(Boolean.FALSE);
            result.setResults(resultList);
            return result;
        }

        final SearchResult searchResult = executeQuery(session, predicateMap);
        logger.debug("searchResult.getStartIndex() {}",
                searchResult.getStartIndex());

        final long startIndex = searchResult.getStartIndex();
        final long hitsPerPage = searchResult.getHitsPerPage();
        final long totalMatches = searchResult.getTotalMatches();
        final long fetchedRecords = startIndex + hitsPerPage;

        if (logger.isDebugEnabled()) {
            logger.debug("Pagination : Offset: {}; "
                            + "Limit: {}; Total: {}; "
                            + "Fetched: {} ",
                    startIndex, hitsPerPage,
                    totalMatches, fetchedRecords);
        }

        result.setOffset(searchResult.getStartIndex());
        final boolean hasMore = fetchedRecords != 0
                && (searchResult.hasMore() || fetchedRecords < totalMatches);
        logger.debug("searchResult.hasMore() {}", hasMore);
        result.setMoreResults(hasMore);
        result.setSuccess(Boolean.TRUE);
        logger.debug("searchResult.getTotalMatches() {}",
                searchResult.getTotalMatches());
        result.setTotalResults(searchResult.getTotalMatches());

        try {
            Resource resource = null;
            for (final Hit hit : searchResult.getHits()) {
                resource = hit.getResource();

                if (slingModelClz != null) {
                    final Page page = resource.adaptTo(Page.class);

                    logger.debug("resource.adaptTo :{}", page);
                    logger.debug("Resource type: {}",
                            resource.getResourceType());
                    logger.debug("Object type : {}",
                            resource.getClass().getName());

                    if (page != null) {
                        adaptToSlingModel(slingModelClz,
                                resultList,
                                page.getContentResource());
                    } else {
                        adaptToSlingModel(slingModelClz,
                                resultList, resource);
                    }
                }
            }
            result.setResults(resultList);
        } catch (RepositoryException e) {
            throw new REWException(e);
        }
        return result;
    }

    /**
     * Method to execute the query.
     *
     * @param session
     * @param predicateMap
     * @return {@link SearchResult}
     *          object after making the search call
     */
    private SearchResult executeQuery(final Session session,
                                      final Map<String, String> predicateMap) {
        if (logger.isDebugEnabled()) {
            logger.debug("Creating predicate group from the map {}",
                    predicateMap);
        }
        final Query query = queryBuilder
                .createQuery(PredicateGroup.create(predicateMap), session);
        logger.debug("Creating Predicate String {}",
                query.getPredicates());

        if (logger.isDebugEnabled()) {
            logger.debug("Executing predicate group search");
        }
        return query.getResult();
    }
}
