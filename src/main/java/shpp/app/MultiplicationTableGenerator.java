package shpp.app;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableGenerator {
    public List<Number> generateTable(Number min, Number max, Number increment, String numbType) {
        ArrayList<Number> multiplicationTable = new ArrayList<>();

        for (Number i = min; !NumericOperations.leftIsBigger(i,max,numbType);
             i = NumericOperations.sum(i,increment,numbType)) {
            multiplicationTable.add(NumericOperations.convertNumber(numbType, i));
        }

        return multiplicationTable;
    }
}
