package com.re.wanderlust.core.services.impl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.ClientResponse;
import com.re.wanderlust.core.exception.REWException;
import com.re.wanderlust.core.models.internals.CommonEntityTours;
import com.re.wanderlust.core.models.internals.TourSearchFormApi;
import com.re.wanderlust.core.services.RestServices;
import com.re.wanderlust.core.services.TourSearchFormService;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component(service = TourSearchFormService.class)
public class TourSearchFormServiceImpl implements TourSearchFormService {
    public static final String DATA = "data";
    @Reference
    private RestServices restServices;

    private ClientResponse clientResponse;

     private String statusCode = StringUtils.EMPTY;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(TourSearchFormServiceImpl.class);



    @Override
    public Map<String, CommonEntityTours>
    getTourSearchFormPage(final String apiUrl) {
        List<TourSearchFormApi> tourList = new ArrayList<>();
        Map<String, CommonEntityTours> tourMap =
                new HashMap<>();
        try {
            clientResponse = restServices.getTourSearchFormPageurl(apiUrl);
            LOGGER.debug("GET clientResponse of api :: {}", clientResponse);
            if (clientResponse != null
                    && clientResponse.getStatusCode()
                    == HttpServletResponse.SC_OK) {

                String toursearchData = clientResponse.getData();
               JSONObject jsonObject = new JSONObject(toursearchData);
               statusCode = jsonObject.getString("code");
       //         JSONArray dataArray = new JSONArray(toursearchData);
               JSONArray dataArray = jsonObject.getJSONArray("data");

                    ObjectMapper objectMapper = new ObjectMapper();
                    tourList = objectMapper.readValue(
                            String.valueOf(dataArray), new
                                    TypeReference<List<TourSearchFormApi>>() {
                            });

            }

            for (TourSearchFormApi locationName : tourList
            ) {
                CommonEntityTours commonEntityTours = new CommonEntityTours();
                commonEntityTours.setWhereLocation(locationName.
                        getWhereLocation());
                commonEntityTours.setStartLocationLong(locationName.
                        getStartLocationLong());
                commonEntityTours.setStartLocationLat(locationName.
                        getStartLocationLat());
                tourMap.put(locationName.getStartLocationName(),
                        commonEntityTours);
            }

        } catch (JSONException e) {
            LOGGER.error("JSONException occurred: {}", e.getMessage());

        } catch (REWException e) {
            LOGGER.error("REWException occurred: {}", e.getMessage());
        } catch (JsonMappingException e) {
            LOGGER.error("JsonMappingException occurred: {}", e.getMessage());
        } catch (JsonProcessingException e) {
            LOGGER.error("JsonProcessingException "
                    + "occurred: {}", e.getMessage());
        }
        return tourMap;

    }

    @Override
    public String getStatusCode() {

        return statusCode;
    }

    @Override
    public List<TourSearchFormApi>
            getWhereList(final String api) {
       List<TourSearchFormApi> tourList = new ArrayList<>();
 //       List<WhereLocationEntityTours> whereList = new ArrayList<>();
        try {
            clientResponse = restServices.getTourSearchFormPageurl(api);
            LOGGER.debug("GET clientResponse of api :: {}", clientResponse);
            if (clientResponse != null
                    && clientResponse.getStatusCode()
                    == HttpServletResponse.SC_OK) {
                String toursearchData = clientResponse.getData();
                JSONObject jsonObject = new JSONObject(toursearchData);
                //         JSONArray dataArray = new JSONArray(toursearchData);
                JSONArray dataArray = jsonObject.getJSONArray("data");

                ObjectMapper objectMapper = new ObjectMapper();
                tourList = objectMapper.readValue(
                        String.valueOf(dataArray), new
                                TypeReference
                                        <List<TourSearchFormApi>>() {
                                });

            }


        } catch (JSONException e) {
            LOGGER.error("JSONException occurred: {}", e.getMessage());

        } catch (JsonMappingException e) {
            LOGGER.error("JsonMappingException occurred: {}", e.getMessage());
        } catch (REWException e) {
            LOGGER.error("REWException occurred: {}", e.getMessage());
        } catch (JsonProcessingException e) {
            LOGGER.error("JsonProcessingException "
                    + "occurred: {}", e.getMessage());
        }
        return tourList;
    }
    }
