package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertEquals(7.0, calculator.sum(3.0, 4.0));
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 5.0));
    }

    @Test
    void subTest() {
        assertEquals(1.0, calculator.sub(5.0, 4.0));
    }

    @Test
    void divideTest() {
        assertEquals(2.0, calculator.divide(10.0, 5.0));
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 29);
        assertEquals(14, calculator.calculeDayBetweenDate(d1, d2));
    }
}
