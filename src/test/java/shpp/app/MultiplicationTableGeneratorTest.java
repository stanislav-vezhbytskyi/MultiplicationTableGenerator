package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableGeneratorTest {
    private MultiplicationTableGenerator generator;
    @BeforeEach
    public void setUp(){
        generator = new MultiplicationTableGenerator();
    }
    @Test
    public void intMultiplicationTableByTwo(){
        ArrayList<Integer> expected = new ArrayList<>(List.of(2,4,6,8,10,12,14,16,18,20));
        ArrayList<Number> real = generator.generateTable(2,20,2,"int");
        Assertions.assertEquals(expected,real);
    }
    @Test
    public void doubleMultiplicationTableByTwo(){
        ArrayList<Double> expected = new ArrayList<>(List.of(2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.0,18.0,20.0));
        ArrayList<Number> real = generator.generateTable(2,20,2,"double");
        Assertions.assertEquals(expected,real);
    }
}
