package shpp.app;

public class MultiplicationTableGenerator {
    public Number[][] generateTable(Number min, Number max, Number increment, String numbType) {
        int size = countTableSize(min, max, increment, numbType);
        Number[][] multiplicationTable = new Number[size][size];

        Number[] multipliersFiled = generateMultipliersField(min, max,increment,numbType);

        int k = 0;
        for (Number i: multipliersFiled) {
            int f = 0;
            for (Number j:multipliersFiled) {
                multiplicationTable[k][f] = NumericOperations.multiply(i, j, numbType);
                f++;
            }
            k++;
        }

        return multiplicationTable;
    }

    public Number[] generateMultipliersField(Number min, Number max, Number increment, String numbType) {
        int size = countTableSize(min, max, increment, numbType);
        Number[] multipliersFiled = new Number[size];

        int j = 0;
        for (Number i = NumericOperations.convertNumber(min,numbType); NumericOperations.compare(i, max, numbType) <= 0;
             i = NumericOperations.sum(i, increment, numbType), j++) {
            multipliersFiled[j] = i;
        }

        return multipliersFiled;
    }

    private static int countTableSize(Number min, Number max, Number increment, String numbType) {
        int size = 0;
        Number i = min;

        while (NumericOperations.compare(i, max, numbType) <= 0) {
            i = NumericOperations.sum(i, increment, numbType);
            size++;
        }

        return size;
    }
}
