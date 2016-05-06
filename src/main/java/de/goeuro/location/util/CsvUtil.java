package de.goeuro.location.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import org.apache.log4j.Logger;

import de.goeuro.location.process.Main;

/**
 * The CsvUtil class
 *
 * @author noushad
 *
 */
public class CsvUtil {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    private static final String CHARSET = "UTF-8";

    /**
     *
     * @param objects
     * @param filePath
     * @throws IOException
     */
    public static void exportListToCsv(List<?> objects, String filePath) throws IOException {
        try (final FileOutputStream output = new FileOutputStream(filePath); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(output, CHARSET));) {
            for (final Object object : objects) {
                bw.write(object.toString());
                bw.newLine();
            }
        } catch (final IOException e) {
            LOGGER.error("Error while writing in to the file", e);
            e.printStackTrace();
            throw e;
        }
    }
}
