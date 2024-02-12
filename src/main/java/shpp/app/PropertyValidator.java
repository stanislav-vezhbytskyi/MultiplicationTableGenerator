package shpp.app;

public class PropertyValidator {
    private PropertyValidator(){}
    public static boolean isPropertyCorrect(Number min, Number max, Number increment, String numbType) {
        return NumericOperations.compare(max, min, numbType) > 0
                && NumericOperations.compare(min, 0, numbType) >= 0
                && NumericOperations.compare(max, 0, numbType) > 0
                && NumericOperations.compare(increment,0,numbType) > 0;
    }
}
