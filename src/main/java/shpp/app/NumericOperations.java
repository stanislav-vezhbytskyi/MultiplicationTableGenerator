package shpp.app;

public class NumericOperations {
    private static final String INT = "int";
    private static final String DOUBLE = "double";
    private static final String FLOAT = "float";
    private static final String SHORT = "short";
    private static final String LONG = "long";
    private static final String BYTE = "byte";

    private NumericOperations() {
    }

    public static Number convertNumber(String numbType, Number value) throws ArithmeticException {
        switch (numbType) {
            case INT:
                return value.intValue();
            case DOUBLE:
                return value.doubleValue();
            case FLOAT:
                return value.floatValue();
            case SHORT:
                return value.shortValue();
            case LONG:
                return value.longValue();
            case BYTE:
                return value.byteValue();
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }

    public static Number sum(Number n1, Number n2, String numbType) {
        switch (numbType) {
            case INT:
                return n1.intValue() + n2.intValue();
            case DOUBLE:
                return n1.doubleValue() + n2.doubleValue();
            case FLOAT:
                return n1.floatValue() + n2.floatValue();
            case SHORT:
                return NumericOperations.convertNumber(SHORT,n1.shortValue() + n2.shortValue());
            case LONG:
                return n1.longValue() + n2.longValue();
            case BYTE:
                return NumericOperations.convertNumber(BYTE,n1.byteValue() + n2.byteValue());
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }

    public static boolean leftIsBigger(Number n1, Number n2, String numbType) {
        switch (numbType) {
            case INT:
                return n1.intValue() > n2.intValue();
            case DOUBLE:
                return n1.doubleValue() >n2.doubleValue();
            case FLOAT:
                return n1.floatValue() > n2.floatValue();
            case SHORT:
                return n1.shortValue() > n2.shortValue();
            case LONG:
                return n1.longValue() > n2.longValue();
            case BYTE:
                return n1.byteValue() > n2.byteValue();
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }
}
