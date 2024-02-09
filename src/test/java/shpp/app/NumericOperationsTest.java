package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumericOperationsTest {
    @Test
    void intTest(){
        Number number1 = new Integer(0);
        Number number2 = NumericOperations.convertNumber(0,"int");
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void floatTest(){
        Number number1 = (float) 0;
        Number number2 = NumericOperations.convertNumber(0,"float");
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void doubleTest(){
        Number number1 = (double) 0;
        Number number2 = NumericOperations.convertNumber(0,"double");
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void incorrectTypeTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> NumericOperations.convertNumber(0,"random string"));
    }
    @Test
    void sumIntTest(){
        Integer expected = 10;
        Number a = 5;
        Number b = 5;
        Assertions.assertEquals(expected,NumericOperations.sum(a,b,"int"));
    }
    @Test
    void sumDoubleTest(){
        Double expected = 10.0;
        Number a = 5.0;
        Number b = 5.0;
        Assertions.assertEquals(expected,NumericOperations.sum(a,b,"double"));
    }
    @Test
    void sumFloatTest(){
        Float expected = 10F;
        Number a = 5;
        Number b = 5;
        Assertions.assertEquals(expected,NumericOperations.sum(a,b,"float"));
    }
    @Test
    void sumShortTest(){
        Short expected = 10;
        Number a = 5;
        Number b = 5;
        Assertions.assertEquals(expected,NumericOperations.sum(a,b,"short"));
    }
    @Test
    void sumByteTest(){
        Byte expected = 10;
        Number a = 5;
        Number b = 5;
        Assertions.assertEquals(expected,NumericOperations.sum(a,b,"byte"));
    }


}
