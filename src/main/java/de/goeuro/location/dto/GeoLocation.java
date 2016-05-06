package de.goeuro.location.dto;

import java.io.Serializable;

/**
 * The GeoLocation class
 *
 * @author noushad
 *
 */
public class GeoLocation implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7626100067893886491L;

    private Float latitude;

    private Float longitude;

    /**
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     *            the latitude to set
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     *            the longitude to set
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}
