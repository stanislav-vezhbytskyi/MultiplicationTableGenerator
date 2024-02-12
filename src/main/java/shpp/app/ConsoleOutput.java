package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleOutput {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleOutput.class);

    public void printTable(Number[][] multiplicationTable) {
        if (multiplicationTable == null || multiplicationTable.length == 0 || multiplicationTable[0] == null || multiplicationTable[0].length == 0) {
            LOGGER.error("The table cannot be built");
            return;
        }

        StringBuilder currentLine = new StringBuilder();

        currentLine.append("  | ");
        for (int i = 1; i < multiplicationTable[0].length; i++) {
            currentLine.append(multiplicationTable[0][i]).append(" ");
        }

        LOGGER.info("{}", currentLine);
        LOGGER.info("----------------------------------------");
        for (int i = 1; i < multiplicationTable.length; i++) {
            currentLine = new StringBuilder();

            currentLine.append(multiplicationTable[i][0]).append(" | ");
            for (int j = 1; j < multiplicationTable[i].length; j++) {
                currentLine.append(multiplicationTable[i][j]).append(" ");
            }

            LOGGER.info("{}", currentLine);
        }
    }

}
