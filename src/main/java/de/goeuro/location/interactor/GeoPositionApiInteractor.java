package de.goeuro.location.interactor;

import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.type.TypeReference;

import de.goeuro.location.dto.Location;
import de.goeuro.location.exception.EntityParseException;
import de.goeuro.location.process.Main;

/**
 * The GeoPositionApiInteractor class
 *
 * @author noushad
 *
 */
public class GeoPositionApiInteractor {

    private static final String ENDPOINT_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

    private static final TypeReference<List<Location>> type = new TypeReference<List<Location>>() {
    };

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public GeoPositionApiInteractor() {
    }

    /**
     *
     * @param cityName
     * @return
     * @throws EntityParseException
     */
    public List<Location> getCityRecords(String cityName) throws EntityParseException {
        LOGGER.debug("Calling Remote API," + ENDPOINT_URL + cityName);
        return GenericHttpApiInteractor.execute(ENDPOINT_URL + cityName, type);
    }

}
