package de.goeuro.location.process;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import de.goeuro.location.dto.Location;
import de.goeuro.location.exception.EntityParseException;
import de.goeuro.location.exception.NoCityProvidedException;
import de.goeuro.location.interactor.GeoPositionApiInteractor;
import de.goeuro.location.util.CsvUtil;

/**
 * The Main class
 *
 * @author noushad
 *
 */
public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String args[]) throws NoCityProvidedException, EntityParseException, IOException {
        if (args.length != 1) {
            LOGGER.error("Please provide the city name as the argument");
            throw new NoCityProvidedException("Please provide the city name as the argument");
        }
        final GeoPositionApiInteractor interator = new GeoPositionApiInteractor();
        final List<Location> jsonObjectList = interator.getCityRecords(args[0]);
        LOGGER.debug("Found " + jsonObjectList.size() + " records");
        LOGGER.debug("Parsing  " + jsonObjectList.size() + " records into locations.csv file");
        CsvUtil.exportListToCsv(jsonObjectList, "/home/noushad/locations.csv");
        LOGGER.debug("Done witing  " + jsonObjectList.size() + " records into locations.csv file");
    }
}
