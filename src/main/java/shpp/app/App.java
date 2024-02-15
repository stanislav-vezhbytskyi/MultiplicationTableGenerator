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
        //todo: this class is too big
        String numbType = DEFAULT_NUMBER_TYPE;
        //new
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

        Number min;
        Number max;
        Number increment;
        try {
            min = NumericOperations.convertNumber(minStr, numbType);
            max = NumericOperations.convertNumber(maxStr, numbType);
            increment = NumericOperations.convertNumber(incrementStr, numbType);
        }catch (NumberFormatException e){
            LOGGER.error("Incorrect property values",e);
            return;
        }

        if(!PropertyValidator.isPropertyCorrect(min,max,increment,numbType)){
            LOGGER.error("Property values is incorrect");
            return;
        }

        MultiplicationTableGenerator generator = new MultiplicationTableGenerator();

        Number[][] multiplicationTable = null;
        Number[] multipliersFiled = null;

        LOGGER.info("Building multiplication table");
        try {
            multiplicationTable = generator.generateTable(min, max, increment, numbType);
            multipliersFiled = generator.generateMultipliersField(min,max,increment,numbType);
        } catch (ArithmeticException e) {
            LOGGER.error("Table cannot be built",e);
        }
        //something change
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.printTable(multiplicationTable,multipliersFiled);
    }
}
