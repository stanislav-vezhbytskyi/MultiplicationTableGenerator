package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PropertyValidatorTest {
    @Test
    void normalState(){
        Assertions.assertTrue(PropertyValidator.isPropertyCorrect(0,5,1,"int"));
    }
    @Test
    void minAndMaxSame(){
        Assertions.assertFalse(PropertyValidator.isPropertyCorrect(0,0,1,"int"));
    }
    @Test
    void incrementIsNotValid(){
        Assertions.assertFalse(PropertyValidator.isPropertyCorrect(0,5,0,"int"));
    }
    @Test
    void minIsNotValid(){
        Assertions.assertFalse(PropertyValidator.isPropertyCorrect(-1,5,0,"int"));
    }
}
