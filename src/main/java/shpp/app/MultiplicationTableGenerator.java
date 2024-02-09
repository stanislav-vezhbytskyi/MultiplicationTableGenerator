package shpp.app;

import java.util.ArrayList;

public class MultiplicationTableGenerator {
    public ArrayList<ArrayList<Number>> generateTable(Number min, Number max, Number increment, String numbType) {
        ArrayList<ArrayList<Number>> multiplicationTable = new ArrayList<>();

        Number currentMin = min;
        Number currentMax = max;
        Number currentIncrement = increment;

        for (Number i = min; NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType)) {

            ArrayList<Number> tableField = new ArrayList<>();
            for (Number j = currentMin; NumericOperations.compare(j, currentMax, numbType) <= 0;
                 j = NumericOperations.sum(j, currentIncrement, numbType)) {

                tableField.add(NumericOperations.convertNumber(j, numbType));
            }

            currentMin = NumericOperations.sum(min, currentMin, numbType);
            currentMax = NumericOperations.sum(max, currentMax, numbType);
            currentIncrement = NumericOperations.sum(increment, currentIncrement, numbType);

            multiplicationTable.add(tableField);
        }


        return multiplicationTable;
    }
}
