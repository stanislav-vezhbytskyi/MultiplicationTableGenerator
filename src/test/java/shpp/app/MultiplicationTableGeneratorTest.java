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
    void byteTest() {
        Number[][] expected = {
                {(byte) 1, (byte) 2},
                {(byte) 2,  (byte) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "byte");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void shortTest() {
        Number[][] expected = {
                { (short) 1, (short) 2},
                { (short) 2, (short) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "short");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void intTest() {
        Number[][] expected = {
                { 1, 2},
                { 2, 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "int");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void longTest() {
        Number[][] expected = {
                { (long) 1, (long) 2},
                { (long) 2, (long) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "long");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void floatTest() {
        Number[][] expected = {
                { (float) 1, (float) 2},
                { (float) 2, (float) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "float");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void doubleTest() {
        Number[][] expected = {
                { (double) 1, (double) 2},
                { (double) 2, (double) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "double");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
    @Test
    void byteFieldTest(){
        Number[] expected = { (byte) 1, (byte) 2,(byte) 3,(byte) 4};
        Number[] real = generator.generateMultipliersField(1,4,1,"byte");

        Assertions.assertArrayEquals(expected,real);
    }
    @Test
    void shortFieldTest(){
        Number[] expected = { (short) 1, (short) 2,(short) 3,(short) 4};
        Number[] real = generator.generateMultipliersField(1,4,1,"short");

        Assertions.assertArrayEquals(expected,real);
    }
    @Test
    void intFieldTest(){
        Number[] expected = {1, 2, 3, 4};
        Number[] real = generator.generateMultipliersField(1, 4, 1, "int");

        Assertions.assertArrayEquals(expected, real);
    }
    @Test
    void longFieldTest(){
        Number[] expected = {1L, 2L, 3L, 4L};
        Number[] real = generator.generateMultipliersField(1L, 4L, 1L, "long");

        Assertions.assertArrayEquals(expected, real);
    }
    @Test
    void floatFieldTest(){
        Number[] expected = {1.0f, 2.0f, 3.0f, 4.0f};
        Number[] real = generator.generateMultipliersField(1.0f, 4.0f, 1.0f, "float");

        Assertions.assertArrayEquals(expected, real);
    }
    @Test
    void doubleFieldTest(){
        Number[] expected = {1.0, 2.0, 3.0, 4.0};
        Number[] real = generator.generateMultipliersField(1.0, 4.0, 1.0, "double");

        Assertions.assertArrayEquals(expected, real);
    }



}

