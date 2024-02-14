package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        String numbType = DEFAULT_NUMBER_TYPE;

        LOGGER.info("Trying to read printFormat in system parameters");
        if (System.getProperties().containsKey(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE)) {
            numbType = System.getProperty(NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE);
        } else {
            LOGGER.warn("no system parameter {}", NAME_OF_SYSTEM_PARAMETER_NUMBER_TYPE);
        }

        PropertyReader propertiesReader = new PropertyReader();
        Properties properties = propertiesReader.readProperties(DEFAULT_EXTERNAL_PROPERTY_PATH);

        String minStr = properties.getProperty(MINIMUM_FIELD_NAME);
        String maxStr = properties.getProperty(MAXIMUM_FIELD_NAME);
        String incrementStr = properties.getProperty(INCREMENT_FIELD_NAME);

        if (minStr == null || maxStr == null || incrementStr == null) {
            LOGGER.error("Incorrect property variables");
            return;
        }

        Number min = NumericOperations.convertNumber(minStr, numbType);
        Number max = NumericOperations.convertNumber(maxStr, numbType);
        Number increment = NumericOperations.convertNumber(incrementStr, numbType);


        if(!PropertyValidator.isPropertyCorrect(min,max,increment,numbType)){
            LOGGER.error("Property values is incorrect");
            return;
        }

        MultiplicationTableGenerator generator = new MultiplicationTableGenerator();
        Number[][] multiplicationTable = null;

        LOGGER.info("Building multiplication table");
        try {
            multiplicationTable = generator.generateTable(min, max, increment, numbType);
        } catch (ArithmeticException e) {
            LOGGER.error(e.toString());
        }

        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.printTable(multiplicationTable);
    }
}
