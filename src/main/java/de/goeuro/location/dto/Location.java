package de.goeuro.location.dto;

import java.io.Serializable;
import java.util.HashMap;

/**
 * The Location class
 *
 * @author noushad
 *
 */
public class Location implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2824334090464550282L;

    private Integer _id;

    private String key;

    private String name;

    private String fullName;

    private String iata_airport_code;

    private String type;

    private String country;

    private GeoLocation geo_position;

    private Integer locationId;

    private Boolean inEurope;

    private Integer countryId;

    private String countryCode;

    private Boolean coreCountry;

    private Float distance;

    private HashMap<String, String> names;

    private HashMap<String, String> alternativeNames;

    /**
     * @return the _id
     */
    public Integer get_id() {
        return _id;
    }

    /**
     * @param _id
     *            the _id to set
     */
    public void set_id(Integer _id) {
        this._id = _id;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     *            the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the iata_airport_code
     */
    public String getIata_airport_code() {
        return iata_airport_code;
    }

    /**
     * @param iata_airport_code
     *            the iata_airport_code to set
     */
    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the geo_position
     */
    public GeoLocation getGeo_position() {
        return geo_position;
    }

    /**
     * @param geo_position
     *            the geo_position to set
     */
    public void setGeo_position(GeoLocation geo_position) {
        this.geo_position = geo_position;
    }

    /**
     * @return the locationId
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * @param locationId
     *            the locationId to set
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * @return the inEurope
     */
    public Boolean getInEurope() {
        return inEurope;
    }

    /**
     * @param inEurope
     *            the inEurope to set
     */
    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    /**
     * @return the countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     *            the countryId to set
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     *            the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the coreCountry
     */
    public Boolean getCoreCountry() {
        return coreCountry;
    }

    /**
     * @param coreCountry
     *            the coreCountry to set
     */
    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    /**
     * @return the distance
     */
    public Float getDistance() {
        return distance;
    }

    /**
     * @param distance
     *            the distance to set
     */
    public void setDistance(Float distance) {
        this.distance = distance;
    }

    /**
     * @return the names
     */
    public HashMap<String, String> getNames() {
        return names;
    }

    /**
     * @param names
     *            the names to set
     */
    public void setNames(HashMap<String, String> names) {
        this.names = names;
    }

    /**
     * @return the alternativeNames
     */
    public HashMap<String, String> getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * @param alternativeNames
     *            the alternativeNames to set
     */
    public void setAlternativeNames(HashMap<String, String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(_id);
        builder.append(",");
        builder.append(name);
        builder.append(",");
        builder.append(type);
        builder.append(",");
        builder.append(getGeo_position().getLatitude());
        builder.append(",");
        builder.append(getGeo_position().getLatitude());
        return builder.toString();
    }

}
