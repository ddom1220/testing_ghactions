package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(15, calculator.add(1,2,3,4,5));
        assertEquals(10, calculator.add(-5,15));
        assertEquals(5, calculator.add(10, -5));
        assertNotEquals(5, calculator.add(1, 2, 3, 4, 5));
    }

}