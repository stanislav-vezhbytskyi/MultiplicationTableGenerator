package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ConsoleOutput {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleOutput.class);

    public void printTable(ArrayList<ArrayList<Number>> multiplicationTable) {
        if (multiplicationTable == null ||multiplicationTable.isEmpty() || !multiplicationTable.get(0).isEmpty()) {
            LOGGER.error("The table cannot be built");
            return;
        }

        StringBuilder currentLine = new StringBuilder();

        currentLine.append("  | ");
        for (int i = 0; i < multiplicationTable.get(0).size(); i++) {
            currentLine.append(multiplicationTable.get(0).get(i)).append(" ");
        }
        LOGGER.info("{}", currentLine);
        LOGGER.info("----------------------------------------");
        for (int i = 1; i < multiplicationTable.size(); i++) {
            currentLine = new StringBuilder();

            currentLine.append(multiplicationTable.get(i).get(0)).append(" | ");
            for (int j = 1; j < multiplicationTable.get(i).size(); j++) {
                currentLine.append(multiplicationTable.get(i).get(j)).append(" ");
            }

            LOGGER.info("{}", currentLine);
        }
    }
}
