package shpp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleOutput {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleOutput.class);

    public void printTable(Number[][] multiplicationTable, Number[] multipliersFiled) {
        if (multiplicationTable == null || multiplicationTable.length == 0 || multiplicationTable[0] == null || multiplicationTable[0].length == 0) {
            LOGGER.error("The table cannot be built");
            return;
        }

        StringBuilder currentLine = new StringBuilder();

        currentLine.append("  | ");
        for (Number i : multipliersFiled) {
            currentLine.append(i).append(" ");
        }

        LOGGER.info("{}", currentLine);
        LOGGER.info("----------------------------------------");
        for (int i = 0; i < multiplicationTable.length; i++) {
            currentLine = new StringBuilder();

            currentLine.append(multipliersFiled[i]).append(" | ");
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                currentLine.append(multiplicationTable[i][j]).append(" ");
            }

            LOGGER.info("{}", currentLine);
        }
    }

    public void printLikeList(Number[][] multiplicationTable, Number[] multipliersFiled) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < multiplicationTable.length; i++) {

            for (int j = 0; j < multiplicationTable.length; j++) {
                sb.append(multipliersFiled[i]).append("*").append(multipliersFiled[j]).append("=")
                        .append(multiplicationTable[j][i]).append("\n");
            }

        }
        LOGGER.info(sb.toString());
    }
}
