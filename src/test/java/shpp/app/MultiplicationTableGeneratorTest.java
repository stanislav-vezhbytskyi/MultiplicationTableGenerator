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
                {null, (byte) 1, (byte) 2},
                {(byte) 1, (byte) 1, (byte) 2},
                {(byte) 2, (byte) 2, (byte) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "byte");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void shortTest() {
        Number[][] expected = {
                {null, (short) 1, (short) 2},
                {(short) 1, (short) 1, (short) 2},
                {(short) 2, (short) 2, (short) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "short");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void intTest() {
        Number[][] expected = {
                {null, 1, 2},
                {1, 1, 2},
                {2, 2, 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "int");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void longTest() {
        Number[][] expected = {
                {null, (long) 1, (long) 2},
                {(long) 1, (long) 1, (long) 2},
                {(long) 2, (long) 2, (long) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "long");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void floatTest() {
        Number[][] expected = {
                {null, (float) 1, (float) 2},
                {(float) 1, (float) 1, (float) 2},
                {(float) 2, (float) 2, (float) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "float");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }

    @Test
    void doubleTest() {
        Number[][] expected = {
                {null, (double) 1, (double) 2},
                {(double) 1, (double) 1, (double) 2},
                {(double) 2, (double) 2, (double) 4}};
        Number[][] real = generator.generateTable(1, 2, 1, "double");

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], real[i], "Arrays at index " + i + " differ");
        }
    }
}

