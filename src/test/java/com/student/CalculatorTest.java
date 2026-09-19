
package com.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(7, calculator.add(7, 0));
    }

    @Test
    void testSubtractionWithZero() {
        assertNotEquals(0, calculator.subtract(8, 3));
    }

    @Test
    void testAdditionResultIsPositive() {
        assertTrue(calculator.add(4, 5) > 0);
    }

    @Test
    void testSubtractionResultIsNotNegative() {
        assertFalse(calculator.subtract(10, 4) < 0);
    }
}
