package shpp.app;

public class MultiplicationTableGenerator {
    public Number[][] generateTable(Number min, Number max, Number increment, String numbType) {
        int size = countTableSize(min, max, increment, numbType);
        Number[][] multiplicationTable = new Number[size][size];

        int k = 1;
        for (Number i = min; NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType), k++) {

            multiplicationTable[0][k] = NumericOperations.convertNumber(i, numbType);
        }

        k = 1;
        for (Number i = min; NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType), k++) {

            int f = 1;
            multiplicationTable[k][0] = NumericOperations.convertNumber(i, numbType);
            for (Number j = min; NumericOperations.compare(j, max, numbType) <= 0;
                 j = NumericOperations.sum(j, increment, numbType), f++) {

                multiplicationTable[k][f] = NumericOperations.multiply(i, j, numbType);
            }
        }

        return multiplicationTable;
    }

    private static int countTableSize(Number min, Number max, Number increment, String numbType) {
        int size = 0;
        Number i = min;

        while (NumericOperations.compare(i, max, numbType) <= 0) {
            i = NumericOperations.sum(i, increment, numbType);
            size++;
        }

        return size + 1;
    }
}
