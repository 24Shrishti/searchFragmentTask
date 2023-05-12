package com.re.wanderlust.core.models.internals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.FooterItemList;
import lombok.Getter;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.json.JSONException;
import org.json.JSONObject;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Getter
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ListOfLink {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String customHeight;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String disableComponent;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String sectionHeading;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String sectionId;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideOnTablet;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideOnMobile;

    @ValueMapValue
    @Default(values = {})
    private String[] listofLinks;

    private List<FooterItemList> itemLists = new ArrayList<>();
    @PostConstruct
    protected void init() throws JsonProcessingException, JSONException {
        if (ArrayUtils.isNotEmpty(listofLinks)) {
            for (String extraLink : listofLinks) {
                FooterItemList footerItem = new FooterItemList();
                JSONObject responseObj = new JSONObject(extraLink);
                ObjectMapper objectMapper = new ObjectMapper();
                footerItem = objectMapper.readValue(String.
                                valueOf(responseObj),
                                new TypeReference<FooterItemList>() { });
                itemLists.add(footerItem);
            }
        }
    }
}
