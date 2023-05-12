package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import org.apache.commons.lang.StringUtils;


import java.text.DecimalFormat;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class
SubstituteBikeEntity {

    protected static final int TEN = 10;
    protected static final int TWO = 2;
    protected static final int FIVE = 5;
    protected static final int EIGHT = 8;
    protected static final int FOUR = 4;
    protected static final int SIX = 6;
    protected static final int ZERO = 0;
    protected static final int NINE = 9;
    protected static final int THOUSAND = 1000;
    @JsonProperty("motor_thumbnail")
    private String motorcycleImages;

    @JsonProperty("entity_id")
    private String newMotorcycleId;


    @JsonProperty("name")
    private String motorcycleName;

    @JsonProperty("approxkmsrun")
    private String approxKmRun;

    @JsonProperty("registered_for_travel")
    private String travelPermitted;

    @JsonProperty("age")
    private String age;

     @JsonProperty("avgRating")
     private String rating;

     @JsonProperty("reviews")
     private String[] reviews;

    @JsonProperty("operatorName")
    private String operatorName;

    @JsonProperty("customisations")
    private  List<String> customisations;

    @JsonProperty("total_reviews")
    private String totalReviews;

    @JsonProperty("currency_type")
    private String currencyType;


    @JsonProperty("motorcycle_location")
    private String motorCycleLocation;

    @JsonProperty("fleet_id")
    private String fleetId;

    @JsonProperty("registration_number")
    private String registrationNumber;

    @JsonProperty("lat")
    private String latitude;

    @JsonProperty("long")
    private String longitude;

    @JsonProperty("priceArray")
    private  List<AlternateBookingPriceEntity> priceArray;

    /**
     * Method to format the Registration No.
     *
     * @return {String}
     */

    public String getRegistrationNumber() {
        String registrationNumberNew = StringUtils.EMPTY;
        if (registrationNumber.length() == NINE) {
            registrationNumberNew = registrationNumber.substring(ZERO, TWO)
                    + " " + registrationNumber.substring(TWO, FOUR)
                    + " " + registrationNumber.substring(FOUR, FIVE)
                    + " " + registrationNumber.substring(
                    FIVE, registrationNumber.length());
        } else {
            registrationNumberNew = registrationNumber.substring(ZERO, TWO)
                    + " " + registrationNumber.substring(TWO, FOUR)
                    + " " + registrationNumber.substring(FOUR, SIX)
                    + " " + registrationNumber.substring(
                    SIX, registrationNumber.length());
        }

        return registrationNumberNew;
    }


    /**
     * Method to format the approx km.
     *
     *
     * @return {String}
     */
    public String getApproxKmRun() {
        String first = approxKmRun.split(" ")[0];
        String third = approxKmRun.split(" ")[2];

        int newValue = Integer.parseInt(first);
        if (newValue < THOUSAND) {
            return new DecimalFormat("###").format(newValue);
        } else {
            double hundreds = newValue % THOUSAND;
            int other = (int) (newValue / THOUSAND);
            first =  new DecimalFormat(
                    ",##").format(other) + ',' + new DecimalFormat(
                    "000").format(hundreds);
        }

        newValue = Integer.parseInt(third);
        if (newValue < THOUSAND) {
            return new DecimalFormat("###").format(newValue);
        } else {
            double hundreds = newValue % THOUSAND;
            int other = (int) (newValue / THOUSAND);
            third = new DecimalFormat(
                    ",##").format(other) + ',' + new DecimalFormat(
                    "000").format(hundreds);
        }


        return first + " " + approxKmRun.split(" ")[1] + " " + third;
    }
}
