package shpp.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumericOperationsTest {
    @Test
    void byteStringConvertTest() {
        Number number1 = (byte) 0;
        Number number2 = NumericOperations.convertNumber("0", "byte");
        assertEquals(number1, number2);
    }

    @Test
    void shortStringConvertTest() {
        Number number1 = (short) 0;
        Number number2 = NumericOperations.convertNumber("0", "short");
        assertEquals(number1, number2);
    }

    @Test
    void intStringConvertTest() {
        Number number1 = new Integer(0);
        Number number2 = NumericOperations.convertNumber("0", "int");
        assertEquals(number1, number2);
    }

    @Test
    void longStringConvertTest() {
        Number number1 = (long) 0;
        Number number2 = NumericOperations.convertNumber("0", "long");
        assertEquals(number1, number2);
    }

    @Test
    void floatStringConvertTest() {
        Number number1 = (float) 0;
        Number number2 = NumericOperations.convertNumber("0", "float");
        assertEquals(number1, number2);
    }

    @Test
    void doubleStringConvertTest() {
        Number number1 = (double) 0;
        Number number2 = NumericOperations.convertNumber("0", "double");
        assertEquals(number1, number2);
    }

    @Test
    void incorrectStringConvertTest() {
        assertThrows(NumberFormatException.class, () -> NumericOperations.convertNumber("word", "int"));
    }

    @Test
    void byteConvertTest() {
        Number number1 = (byte) 0;
        Number number2 = NumericOperations.convertNumber(0, "byte");
        assertEquals(number1, number2);
    }

    @Test
    void shortConvertTest() {
        Number number1 = (short) 0;
        Number number2 = NumericOperations.convertNumber(0, "short");
        assertEquals(number1, number2);
    }

    @Test
    void intConvertTest() {
        Number number1 = new Integer(0);
        Number number2 = NumericOperations.convertNumber(0, "int");
        assertEquals(number1, number2);
    }

    @Test
    void longConvertTest() {
        Number number1 = (long) 0;
        Number number2 = NumericOperations.convertNumber(0, "long");
        assertEquals(number1, number2);
    }

    @Test
    void floatConvertTest() {
        Number number1 = (float) 0;
        Number number2 = NumericOperations.convertNumber(0, "float");
        assertEquals(number1, number2);
    }

    @Test
    void doubleConvertTest() {
        Number number1 = (double) 0;
        Number number2 = NumericOperations.convertNumber(0, "double");
        assertEquals(number1, number2);
    }

    @Test
    void incorrectTypeTest() {
        assertThrows(IllegalArgumentException.class, () -> NumericOperations.convertNumber(0, "random string"));
    }

    @Test
    void sumByteTest() {
        Byte expected = 10;
        Number a = 5;
        Number b = 5;
        assertEquals(expected, NumericOperations.sum(a, b, "byte"));
    }

    @Test
    void sumShortTest() {
        Short expected = 10;
        Number a = 5;
        Number b = 5;
        assertEquals(expected, NumericOperations.sum(a, b, "short"));
    }

    @Test
    void sumIntTest() {
        Integer expected = 10;
        Number a = 5;
        Number b = 5;
        assertEquals(expected, NumericOperations.sum(a, b, "int"));
    }

    @Test
    void sumLongTest() {
        Long expected = new Long(10);
        Number a = 5;
        Number b = 5;
        assertEquals(expected, NumericOperations.sum(a, b, "long"));
    }

    @Test
    void sumFloatTest() {
        Float expected = 10F;
        Number a = 5;
        Number b = 5;
        assertEquals(expected, NumericOperations.sum(a, b, "float"));
    }

    @Test
    void sumDoubleTest() {
        Double expected = 10.0;
        Number a = 5.0;
        Number b = 5.0;
        assertEquals(expected, NumericOperations.sum(a, b, "double"));
    }

    @Test
    void multiplyByteTest() {
        Byte expected = 10;
        Number a = 2;
        Number b = 5;
        assertEquals(expected, NumericOperations.multiply(a, b, "byte"));
    }

    @Test
    void multiplyShortTest() {
        Short expected = 10;
        Number a = 2;
        Number b = 5;
        assertEquals(expected, NumericOperations.multiply(a, b, "short"));
    }

    @Test
    void multiplyIntTest() {
        Integer expected = 10;
        Number a = 2;
        Number b = 5;
        assertEquals(expected, NumericOperations.multiply(a, b, "int"));
    }

    @Test
    void multiplyLongTest() {
        Long expected = new Long(10);
        Number a = 5;
        Number b = 2;
        assertEquals(expected, NumericOperations.multiply(a, b, "long"));
    }

    @Test
    void multiplyFloatTest() {
        Float expected = 10F;
        Number a = 2;
        Number b = 5;
        assertEquals(expected, NumericOperations.multiply(a, b, "float"));
    }

    @Test
    void multiplyDoubleTest() {
        Double expected = 10.0;
        Number a = 5.0;
        Number b = 2.0;
        assertEquals(expected, NumericOperations.multiply(a, b, "double"));
    }
    @Test
    void multiplyOutOfBoundsForByte(){
        byte a = Byte.MAX_VALUE-1;
        Assertions.assertThrows(ArithmeticException.class, ()->NumericOperations.multiply(a,2,"byte"));

    }
    @Test
    void multiplyOutOfBoundsForShort(){
        short a = Short.MAX_VALUE-1;
        Assertions.assertThrows(ArithmeticException.class, ()->NumericOperations.multiply(a,2,"short"));
    }
    @Test
    void multiplyOutOfBoundsForInt(){
        int a = Integer.MAX_VALUE-1;
        Assertions.assertThrows(ArithmeticException.class, ()->NumericOperations.multiply(a,2,"int"));
    }
    @Test
    void multiplyOutOfBoundsForFloat(){
        Float a = Float.MAX_VALUE-Float.MIN_VALUE;
        Assertions.assertThrows(ArithmeticException.class, ()->NumericOperations.multiply(a,2,"float"));
    }

    @Test
    void testCompareIntegers() {
        Number n1 = 5;
        Number n2 = 10;
        assertEquals(-5, NumericOperations.compare(n1, n2, "int"));
        assertEquals(5, NumericOperations.compare(n2, n1, "int"));
        assertEquals(0, NumericOperations.compare(n1, n1, "int"));
    }

    @Test
    void testCompareDoubles() {
        Number n1 = 3.5;
        Number n2 = 2.5;
        assertEquals(1, NumericOperations.compare(n1, n2, "double"));
        assertEquals(-1, NumericOperations.compare(n2, n1, "double"));
        assertEquals(0, NumericOperations.compare(n1, n1, "double"));
    }

    @Test
    void testCompareFloats() {
        Number n1 = 4.2f;
        Number n2 = 2.8f;
        assertEquals(1, NumericOperations.compare(n1, n2, "float"));
        assertEquals(-1, NumericOperations.compare(n2, n1, "float"));
        assertEquals(0, NumericOperations.compare(n1, n1, "float"));
    }

    @Test
    void testCompareShorts() {
        Number n1 = (short) 10;
        Number n2 = (short) 5;
        assertEquals(5, NumericOperations.compare(n1, n2, "short"));
        assertEquals(-5, NumericOperations.compare(n2, n1, "short"));
        assertEquals(0, NumericOperations.compare(n1, n1, "short"));
    }

    @Test
    void testCompareLongs() {
        Number n1 = 100L;
        Number n2 = 50L;
        assertEquals(50, NumericOperations.compare(n1, n2, "long"));
        assertEquals(-50, NumericOperations.compare(n2, n1, "long"));
        assertEquals(0, NumericOperations.compare(n1, n1, "long"));
    }

    @Test
    void testCompareBytes() {
        Number n1 = (byte) 8;
        Number n2 = (byte) 3;
        assertEquals(5, NumericOperations.compare(n1, n2, "byte"));
        assertEquals(-5, NumericOperations.compare(n2, n1, "byte"));
        assertEquals(0, NumericOperations.compare(n1, n1, "byte"));
    }

    @Test
    void testInvalidNumberType() {
        Number n1 = 5;
        Number n2 = 10;
        assertThrows(IllegalArgumentException.class, () -> {
            NumericOperations.compare(n1, n2, "invalidType");
        });
    }

}
