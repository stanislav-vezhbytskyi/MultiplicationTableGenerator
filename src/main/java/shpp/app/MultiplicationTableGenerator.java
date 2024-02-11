package shpp.app;

import java.util.ArrayList;

public class MultiplicationTableGenerator {
    public ArrayList<ArrayList<Number>> generateTable(Number min, Number max, Number increment, String numbType) {
        ArrayList<ArrayList<Number>> multiplicationTable = new ArrayList<>();

        int size = arrSize(min,max,increment,numbType);
        //Number[][] multiplicationTable = new Number[size][size];
        //first horizontal row
        ArrayList<Number> tableField = new ArrayList<>();
        for (Number i = min; NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType)) {

            tableField.add(i);
        }
        multiplicationTable.add(tableField);


        for (Number i = min; NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType)) {
            tableField = new ArrayList<>();
            //vertical row of base numbers int the table
            tableField.add(i);

            //multiplication result
            for (Number j = min; NumericOperations.compare(j, max, numbType) <= 0;
                 j = NumericOperations.sum(j, increment, numbType)) {

                tableField.add(NumericOperations.multiply(i, j, numbType));
            }

            multiplicationTable.add(tableField);
        }

        return multiplicationTable;
    }

    private static int arrSize(Number min, Number max, Number increment, String numbType) {
        int size = 0;
        Number i = min;

        while (NumericOperations.compare(i, max, numbType) >= 0) {
            i = NumericOperations.sum(i, increment, numbType);
            size++;
        }

        return size > 0 ? 1 : 0;
    }
}
