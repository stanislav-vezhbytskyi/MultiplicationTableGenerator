package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberFactoryTest {
    @Test
    void intTest(){
        Number number1 = new Integer(0);
        Number number2 = NumericOperations.getNumber("int",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void floatTest(){
        Number number1 = (float) 0;
        Number number2 = NumericOperations.getNumber("float",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void doubleTest(){
        Number number1 = (double) 0;
        Number number2 = NumericOperations.getNumber("double",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    void incorrectTypeTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> NumericOperations.getNumber("random string",0));
    }
}
