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

    public static Number convertNumber(Number value, String numbType) throws ArithmeticException {
        checkRange(value, numbType);
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

    public static Number convertNumber(String value, String numbType) throws ArithmeticException {
        switch (numbType) {
            case INT:
                checkRange(Integer.valueOf(value), numbType);
                return Integer.valueOf(value);
            case DOUBLE:
                checkRange(Double.valueOf(value), numbType);
                return Double.valueOf(value);
            case FLOAT:
                checkRange(Float.valueOf(value), numbType);
                return Float.valueOf(value);
            case SHORT:
                checkRange(Short.valueOf(value), numbType);
                return Short.valueOf(value);
            case LONG:
                checkRange(Long.valueOf(value), numbType);
                return Long.valueOf(value);
            case BYTE:
                checkRange(Byte.valueOf(value), numbType);
                return Byte.valueOf(value);
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }

    public static Number sum(Number n1, Number n2, String numbType) {
        checkRange(n1, numbType);
        checkRange(n2, numbType);

        switch (numbType) {
            case INT:
                return n1.intValue() + n2.intValue();
            case DOUBLE:
                return n1.doubleValue() + n2.doubleValue();
            case FLOAT:
                return n1.floatValue() + n2.floatValue();
            case SHORT:
                return NumericOperations.convertNumber(n1.shortValue() + n2.shortValue(), SHORT);
            case LONG:
                return n1.longValue() + n2.longValue();
            case BYTE:
                return NumericOperations.convertNumber(n1.byteValue() + n2.byteValue(), BYTE);
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }

    public static Number multiply(Number n1, Number n2, String numbType) {
        checkRange(n1,numbType);
        checkRange(n2,numbType);

        switch (numbType) {
            case INT:
                return n1.intValue() * n2.intValue();
            case DOUBLE:
                return n1.doubleValue() * n2.doubleValue();
            case FLOAT:
                return n1.floatValue() * n2.floatValue();
            case SHORT:
                return NumericOperations.convertNumber(n1.shortValue() * n2.shortValue(), SHORT);
            case LONG:
                return n1.longValue() * n2.longValue();
            case BYTE:
                return NumericOperations.convertNumber(n1.byteValue() * n2.byteValue(), BYTE);
            default:
                throw new IllegalArgumentException("Incorrect type " + numbType);
        }
    }

    public static int compare(Number n1, Number n2, String numbType) {
        checkRange(n1, numbType);
        checkRange(n2, numbType);

        switch (numbType) {
            case INT:
                return n1.intValue() - n2.intValue();
            case DOUBLE:
                return Double.compare(n1.doubleValue(), n2.doubleValue());
            case FLOAT:
                return Float.compare(n1.floatValue(), n2.floatValue());
            case SHORT:
                return n1.shortValue() - n2.shortValue();
            case LONG:
                return (int) (n1.longValue() - n2.longValue());
            case BYTE:
                return n1.byteValue() - n2.byteValue();
            default:
                throw new IllegalArgumentException("incorrect type " + numbType);
        }
    }

    private static void checkRange(Number value, String numbType) {
        switch (numbType) {
            case INT:
                if (value.longValue() > Integer.MAX_VALUE || value.longValue() < Integer.MIN_VALUE) {
                    throw new ArithmeticException("Value "+value.longValue()+" out of range for int");
                }
                break;
            case DOUBLE:
                // No range check for double
                break;
            case FLOAT:
                // No range check for float
                break;
            case SHORT:
                if (value.longValue() > Short.MAX_VALUE || value.longValue() < Short.MIN_VALUE) {
                    throw new ArithmeticException("Value "+value.longValue()+" out of range for short ");
                }
                break;
            case LONG:
                // No range check for long
                break;
            case BYTE:
                if (value.longValue() > Byte.MAX_VALUE || value.longValue() < Byte.MIN_VALUE) {
                    throw new ArithmeticException("Value "+value.longValue()+" out of range for byte");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid type " + numbType);
        }
    }
}
