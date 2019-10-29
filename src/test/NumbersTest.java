package test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
@Test
    public void isPositiveNumber (){
    boolean number = Numbers.isPositive(20);
    assertTrue(number);
}

@Test
    public void isZeroNumber(){
    boolean number = Numbers.isPositive(0);
    assertFalse(number);
}
}