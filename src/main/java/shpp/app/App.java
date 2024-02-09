package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private static final String NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE = "numberType";
    private static final String DEFAULT_NUMBER_TYPE = "int";
    private static final String MINIMUM_FIELD_NAME = "minimal";
    private static final String MAXIMUM_FIELD_NAME = "maximum";
    private static final String INCREMENT_FIELD_NAME = "increment";
    private static final String DEFAULT_EXTERNAL_PROPERTY_PATH = "app.properties";

    public static void main(String[] args) {
        String numbType;

        LOGGER.info("Trying to read printFormat in system parameters");
        if (System.getProperties().containsKey(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE)) {
            numbType = System.getProperty(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE);
        } else {
            numbType = DEFAULT_NUMBER_TYPE;
            LOGGER.warn(String.format("no system parameter %s", NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE));
        }

        PropertiesReader propertiesReader = new PropertiesReader();
        Properties properties = propertiesReader.readProperties(DEFAULT_EXTERNAL_PROPERTY_PATH);

        String minimum = properties.getProperty(MINIMUM_FIELD_NAME);
        String maximum = properties.getProperty(MAXIMUM_FIELD_NAME);
        String incrementStr = properties.getProperty(INCREMENT_FIELD_NAME);

        Number min = NumericOperations.convertNumber(minimum,numbType);
        Number max = NumericOperations.convertNumber(maximum,numbType);
        Number increment = NumericOperations.convertNumber(incrementStr,numbType);

        MultiplicationTableGenerator generator = new MultiplicationTableGenerator();
        ArrayList<ArrayList<Number>> multiplicationTable = generator.generateTable(min, max, increment, numbType);


        for (ArrayList<Number> temp:multiplicationTable) {
            for (Number i:temp) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
