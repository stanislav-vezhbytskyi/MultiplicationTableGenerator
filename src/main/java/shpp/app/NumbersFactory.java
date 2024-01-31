package shpp.app;

public class NumbersFactory {
    private NumbersFactory(){}
    public static Number getNumber (String numbType, int value)throws ArithmeticException{
        Number returnedObj;
        switch (numbType){
            case "int":
                returnedObj = new Integer(value);
                break;
            case "double":
                returnedObj = new Double(value);
                break;
            case "float":
                returnedObj = new Float(value);
                break;
            default:
                throw new IllegalArgumentException("incorrect type "+numbType);
        }
        return returnedObj;
    }
}
