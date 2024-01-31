package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class NumberFactoryTest {
    @Test
    public void intTest(){
        Number number1 = new Integer(0);
        Number number2 = NumbersFactory.getNumber("int",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    public void floatTest(){
        Number number1 = new Float(0);
        Number number2 = NumbersFactory.getNumber("float",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    public void doubleTest(){
        Number number1 = new Double(0);
        Number number2 = NumbersFactory.getNumber("double",0);
        Assertions.assertEquals(number1,number2);
    }
    @Test
    public void incorrectTypeTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->NumbersFactory.getNumber("random string",0));
    }
}
