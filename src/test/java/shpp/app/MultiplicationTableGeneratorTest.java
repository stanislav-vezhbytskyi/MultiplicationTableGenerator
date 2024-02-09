package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MultiplicationTableGeneratorTest {
    private MultiplicationTableGenerator generator;

    @BeforeEach
    public void setUp() {
        generator = new MultiplicationTableGenerator();
    }

  /*  @Test
    void shortMultiplicationTableByTwo() {
        ArrayList<Short> expected = new ArrayList<>(List.of((short) 2, (short) 4, (short) 6, (short) 8,
                (short) 10, (short) 12, (short) 14, (short) 16, (short) 18, (short) 20));
        List<Number> real = generator.generateTable(2, 20, 2, "short");
        Assertions.assertEquals(expected, real);
    }

    @Test
    void intMultiplicationTableByTwo() {
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));
        List<Number> real = generator.generateTable(2, 20, 2, "int");
        Assertions.assertEquals(expected, real);
    }

    @Test
    void doubleMultiplicationTableByTwo() {
        ArrayList<Double> expected = new ArrayList<>(List.of(2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0));
        List<Number> real = generator.generateTable(2, 20, 2, "double");
        Assertions.assertEquals(expected, real);
    }

    @Test
    void floatMultiplicationTableByTwo() {
        ArrayList<Float> expected = new ArrayList<>(List.of(2.0f, 4.0f, 6.0f, 8.0f, 10.0f, 12.0f, 14.0f, 16.0f, 18.0f, 20.0f));
        List<Number> real = generator.generateTable(2, 20, 2, "float");
        Assertions.assertEquals(expected, real);
    }

    @Test
    void maxValueForLong(){
        List<Number> real = generator.generateTable(2, 20 , 2, "long");
    }
*/

}
