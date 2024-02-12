package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplicationTableGeneratorTest {
    private MultiplicationTableGenerator generator;

    @BeforeEach
    public void setUp() {
        generator = new MultiplicationTableGenerator();
    }

    @Test
    void byteTest(){
        Number[][] expected = {{(byte)4,(byte)6},{(byte)6,(byte)9}};
        Number[][] real = generator.generateTable(2,3,1,"byte");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void shortTest(){
        Number[][] expected = {{(short)4,(short)6},{(short)6,(short)9}};
        Number[][] real = generator.generateTable(2,3,1,"short");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void intTest(){
        Number[][] expected = {{4,6},{6,9}};
        Number[][] real = generator.generateTable(2,3,1,"int");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void longTest(){
        Number[][] expected = {{(long)4,(long)6},{(long)6,(long)9}};
        Number[][] real = generator.generateTable(2,3,1,"long");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void floatTest(){
        Number[][] expected = {{(float)4,(float)6},{(float)6,(float)9}};
        Number[][] real = generator.generateTable(2,3,1,"float");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void doubleTest(){
        Number[][] expected = {{(double)4,(double)6},{(double)6,(double)9}};
        Number[][] real = generator.generateTable(2,3,1,"double");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
}

