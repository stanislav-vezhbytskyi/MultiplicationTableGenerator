package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesReader {
    public static String DEFAULT_EXTERNAL_PROPERTY_PATH = "app.properties";
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesReader.class);
    public Properties readProperties(){
        Properties properties = new Properties();

        InputStream is = ClassLoader.getSystemResourceAsStream(DEFAULT_EXTERNAL_PROPERTY_PATH);

        LOGGER.info("Trying to read an external properties file");
        if (is != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(is,StandardCharsets.UTF_8);

            LOGGER.info("external properties file exist");
            try {
                properties.load(inputStreamReader);

                LOGGER.info("external properties file has been read");
            } catch (IOException ex) {
                LOGGER.error(ex.toString(),ex);
            }
        } else {
            LOGGER.error("properties not found");
        }
        return properties;
    }
}
