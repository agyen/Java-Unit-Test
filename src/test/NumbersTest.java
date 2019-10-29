package test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    //Test for isPositive function
    @Test
    public void isPositiveNumber() {
        boolean number = Numbers.isPositive(20);
        assertTrue(number);
    }

    @Test
    public void isZeroNumber() {
        boolean number = Numbers.isPositive(0);
        assertFalse(number);
    }

    @Test
    public void isNegativeOne() {
        boolean number = Numbers.isPositive(-1);
        assertFalse(number);
    }

    @Test
    public void isPositiveOne() {
        boolean number = Numbers.isPositive(1);
        assertTrue(number);
    }

    @Test
    public void isNegativeNumber() {
        boolean number = Numbers.isPositive(-25);
        assertFalse(number);
    }

    //Test for isNegative function
    @Test
    public void isNegNumber() {
        boolean number = Numbers.isNegative(-456);
        assertTrue(number);
    }

    @Test
    public void isNegOne() {
        boolean number = Numbers.isNegative(-1);
        assertTrue(number);
    }

    @Test
    public void isPositiveNum() {
        boolean number = Numbers.isNegative(67);
        assertFalse(number);
    }

    @Test
    public void isPositive1() {
        boolean number = Numbers.isNegative(1);
        assertFalse(number);
    }

    @Test
    public void isZeroNum() {
        boolean number = Numbers.isNegative(0);
        assertFalse(number);
    }

    //Test for even numbers greater than zeros
    @Test
    public void numberGreaterThanZeroButNotEven() {
        boolean number = Numbers.isEvenGreaterThanZero(43);
        assertFalse(number);
    }

    @Test
    public void numberIsOne() {
        boolean number = Numbers.isEvenGreaterThanZero(1);
        assertFalse(number);
    }

    @Test
    public void numberLessThanOne() {
        boolean number = Numbers.isEvenGreaterThanZero(-2);
        assertFalse(number);
    }

    @Test
    public void numberGreaterThanZeroAndEven() {
        boolean number = Numbers.isEvenGreaterThanZero(44);
        assertTrue(number);
    }

    @Test
    public void numberEqualsZero() {
        boolean number = Numbers.isEvenGreaterThanZero(0);
        assertFalse(number);
    }

    //test for the sum of two positive integer
    @Test
    public void addingTwoNumbers() {
        int number = Numbers.sumTwonumbers(3, 7);
        assertEquals(10, number);
    }

    @Test
    public void adding2Numbers() {
        int number = Numbers.sumTwonumbers(4, 7);
        assertEquals(11, number);
    }
}