package de.goeuro.location.interactor;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.goeuro.location.dto.Location;
import de.goeuro.location.exception.EntityParseException;
import de.goeuro.location.process.Main;

/**
 * The ApiInteractor class
 *
 * @author noushad
 *
 */
public class GenericHttpApiInteractor {

    private static ClientConfig clientConfig;

    private static Client client;

    private static final ObjectMapper MAPPER;

    private final static Logger LOGGER;

    static {
        clientConfig = new ClientConfig();
        client = ClientBuilder.newClient(clientConfig);
        MAPPER = new ObjectMapper();
        LOGGER = Logger.getLogger(Main.class);
    }

    static <T> List<Location> execute(String url, TypeReference<T> type) throws EntityParseException {
        final WebTarget webTarget = client.target(url);
        final Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        final String content = invocationBuilder.get(String.class);
        try {
            return MAPPER.readValue(content, type);
        } catch (final Exception e) {
            LOGGER.error("Error while parsing the response to TypeReference arguments", e);
            throw new EntityParseException("Error while parsing the response to TypeReference arguments", e);
        }
    }
}
