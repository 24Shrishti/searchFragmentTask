package com.re.wanderlust.core.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.ClientResponse;
import com.re.wanderlust.core.beans.ReviewDetailListEntity;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.exception.REWException;
import com.re.wanderlust.core.services.RestServices;
import com.re.wanderlust.core.services.ReviewDetailService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component(service = ReviewDetailService.class,
            immediate = true, enabled = true)
public class ReviewDetailServiceImpl implements ReviewDetailService {

    static final Logger LOGGER =
            LoggerFactory.getLogger(ReviewDetailServiceImpl.class);

    protected static final String DEFAULT_OFFSET = "/1/";

    @Reference
    private RestServices restServices;

    @Override
   public ReviewDetailListEntity getReviewDetail(
            final String selectors, final String limit,
            final String reviewDetailApiUrl, final String categories) {
       ReviewDetailListEntity reviewDetailEntity = new ReviewDetailListEntity();
       String reviewDetailApi = reviewDetailApiUrl;
        reviewDetailApi = reviewDetailApi + CommonConstants.SLASH
                + limit + DEFAULT_OFFSET + selectors
                + CommonConstants.SLASH + categories;

        LOGGER.debug("GET reviewDetailApi :: {}", reviewDetailApi);

        try {
           ClientResponse clientResponse =
                   restServices.getReviewDetail(reviewDetailApi);
            LOGGER.debug("GET clientResponse of api :: {}", clientResponse);
            if (clientResponse != null
                    && clientResponse.getStatusCode()
                    == HttpServletResponse.SC_OK) {
                JSONObject responseObj = new JSONObject(
                        clientResponse.getData());
                if (responseObj.has(CommonConstants.DATA)) {
                    JSONArray dataObj = responseObj
                            .getJSONArray(CommonConstants.DATA);
                  JSONObject reviewObject = dataObj.getJSONObject(0);

                    ObjectMapper objectMapper = new ObjectMapper();
                    reviewDetailEntity =
                            objectMapper.readValue(String.valueOf(reviewObject),
                            new TypeReference<ReviewDetailListEntity>() { });
                    LOGGER.debug("GET reviewDetailEntity after binding"
                            + " from entity :: {}", reviewDetailEntity);
               //     if (StringUtils.equals(categories, "rental")) {
                        int totalReviews = Integer.parseInt(
                                reviewDetailEntity.getTotalReviews());
                        int loadLimit = Integer.parseInt(limit);
                        int flag = totalReviews / loadLimit;
                        if (totalReviews <= loadLimit) {
                            flag = 0;
                        }
                        reviewDetailEntity.setFlag(String.valueOf(flag));
               //     }
                }
            } else {
                return reviewDetailEntity;
            }
        } catch (IOException | REWException | JSONException e) {
            LOGGER.error("JSONException | IOException | REWException"
                    + ":: ReviewDetailServiceImpl() "
                    + ":: getReviewDetail{0}", e);
        }

        LOGGER.debug("Return reviewDetailEntity :: {}", reviewDetailEntity);
        return reviewDetailEntity;
    }

}
