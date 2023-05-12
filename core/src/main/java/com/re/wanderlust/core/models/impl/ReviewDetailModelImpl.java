package com.re.wanderlust.core.models.impl;

import com.re.wanderlust.core.beans.ReviewDetailListEntity;
import com.re.wanderlust.core.models.ReviewDetailModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.services.ReviewDetailService;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Represents a Review Detail Model impl.
 * that fetches all reviews of the operator
 *
 * @version 1.0
 * @since 1.0
 */

@Getter
@Model(adaptables = {SlingHttpServletRequest.class},
        adapters = {ReviewDetailModel.class},
        resourceType = {ReviewDetailModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ReviewDetailModelImpl extends BaseComponentModel
        implements ReviewDetailModel  {

    protected static final
    String RESOURCE_TYPE = "re-wanderlust/components/reviewDetail";

    private static final Logger LOGGER = LoggerFactory
            .getLogger(ReviewDetailModelImpl.class);
    public static final String RENTAL = "rental";
    public static final String REGEX = "\\.";
    public static final String HTML = ".html";
    public static final String TOUR = "tour";
    public static final String TOUR1 = "Tour";
    public static final String RENTAL1 = "Rental";
    public static final String TOUR_REVIEW_DETAIL_PAGE =
            "Tour Review Detail Page";
    public static final String OPERATOR_REVIEW_DETAIL_PAGE =
            "Operator Review Detail Page";

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String deskImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String mobileImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String userImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String locationIconPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String btnText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String ratingLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String overAllLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String limit;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String starIconPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String starLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String readMoreLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String readlessLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String reviewedLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String dateLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String userImageAltTxt;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String btnLink;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String loadMorebtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String errorMsg;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String badRequest;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String notFound;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String serverError;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String limitOfReviewCharacters;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String wanderlustCategories;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String toursCategories;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourId;

    private  String suffix = StringUtils.EMPTY;

    private ReviewDetailListEntity listOfReviews =
            new ReviewDetailListEntity();

    @OSGiService
    private ReviewDetailService reviewDetailService;

    @ScriptVariable
    private SlingHttpServletRequest request;
    @SlingObject
    private Resource currentResource;

    /**
     * Method to fetch the list of Reviews Detail.
     * @return {@link ReviewDetailListEntity}
     */
    public ReviewDetailListEntity getListOfReviews() {
        List<String> listOfSuffix = CommonUtils.getSuffixFromUrl(request);

        if (StringUtils.equals(wanderlustCategories, TOUR1)
                && StringUtils.equals(toursCategories,
                TOUR_REVIEW_DETAIL_PAGE)
                && StringUtils.isNotBlank(tourId)) {
            String tourDetailUrl = CommonUtils.getAPIConfig(
                    currentResource).apiBaseUrl()
                    + CommonUtils.
                    getAPIConfig(currentResource)
                    .tourDetailApiUrl();
            return reviewDetailService
                    .getReviewDetail(tourId, limit, tourDetailUrl, TOUR);
        } else if (listOfSuffix.size() == 2) {
            suffix = listOfSuffix.get(1);

            if (suffix.contains(HTML)) {
                String[] suffixArray = suffix.split(REGEX);
                if (suffixArray != null) {
                    suffix = suffixArray[1];
                }
                LOGGER.debug(" Suffix(operator Id) In URL {}", suffix);
            }

            if (suffix != null && StringUtils.isNotBlank(suffix)) {
                String apiUrl = CommonUtils.getAPIConfig(
                        currentResource).apiBaseUrl()
                        + CommonUtils.getAPIConfig(
                        currentResource).reviewDetailAPIUrl();
                if (StringUtils.equals(wanderlustCategories, RENTAL1)) {
                    return reviewDetailService
                            .getReviewDetail(suffix, limit, apiUrl, RENTAL);
                } else if (StringUtils.equals(wanderlustCategories, TOUR1)
                        && StringUtils.equals(
                        toursCategories, OPERATOR_REVIEW_DETAIL_PAGE)) {
                    return reviewDetailService
                            .getReviewDetail(suffix, limit, apiUrl, TOUR);
                }
            }
        }

        return new ReviewDetailListEntity();
    }

}
