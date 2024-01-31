package shpp.app;

import java.util.ArrayList;

public class MultiplicationTableGenerator {
    public ArrayList<Number> generateTable(int min, int max, int increment, String numbType) {
        ArrayList<Number> multiplicationTable = new ArrayList<>();

        for (int i = min; i <= max; i += increment) {
            multiplicationTable.add(NumbersFactory.getNumber(numbType, i));
        }

        return multiplicationTable;
    }
}
