package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

public class App
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private static final String NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE = "numberType";
    private static final String DEFAULT_NUMBER_TYPE = "int";
    public static void main( String[] args )
    {
        String numbType;

        LOGGER.info("Trying to read printFormat in system parameters");
        if (System.getProperties().containsKey(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE)) {
            numbType = System.getProperty(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE);
        } else {
            numbType = DEFAULT_NUMBER_TYPE;
            LOGGER.warn(String.format("no system parameter %s", NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE));
        }

        PropertiesReader propertiesReader = new PropertiesReader();
        Properties properties = propertiesReader.readProperties();

        MultiplicationTableGenerator generator = new MultiplicationTableGenerator();
        List<Number> multiplicationTable = generator.generateTable(1,20,2,"double");

        for (Number i:multiplicationTable) {
            LOGGER.info(i.toString());
        }
    }
}
