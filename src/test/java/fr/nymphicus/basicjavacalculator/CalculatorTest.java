package fr.nymphicus.basicjavacalculator;

import org.junit.Test;

import fr.nymphicus.basicjavacalculator.Calculator;

import static org.junit.Assert.*;

/*
 * Class to test Calculator
 */
public class CalculatorTest {
    
    /*
     * Addition test
     */
    @Test
    public void testAddition(){
        assertEquals(2.0,Calculator.addition(1.0, 1.0),0.0001);
        assertEquals(-1.0,Calculator.addition(1.0, -2.0),0.0001);
        assertEquals(0.0,Calculator.addition(0.0, 0.0),0.0001);
    }

    /*
     * Substraction test
     */
    @Test
    public void testSubstraction(){
        assertEquals(0.0,Calculator.substraction(1.0, 1.0),0.0001);
        assertEquals(3.0,Calculator.substraction(1.0, -2.0),0.0001);
        assertEquals(-5.0,Calculator.substraction(0.0, 5.0),0.0001);
        assertEquals(0.0,Calculator.substraction(0.0, 0.0),0.0001);
    }

    /*
     * Multiplication test
     */
    @Test
    public void testMultiplication(){
        assertEquals(1.0,Calculator.multiplication(1.0, 1.0),0.0001);
        assertEquals(4.0,Calculator.multiplication(-2.0, -2.0),0.0001);
        assertEquals(-5.0,Calculator.multiplication(1.0, -5.0),0.0001);
        assertEquals(0.0,Calculator.multiplication(0.0, 0.0),0.0001);
    }

    /*
     * Division test
     */
    @Test
    public void testDivision(){
        assertEquals(2.0, Calculator.division(6.0, 3.0), 0.0001);
        assertEquals(-2.0, Calculator.division(6.0, -3.0), 0.0001);
    }

    /*
     * Division by zero test
     */
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero(){
        Calculator.division(6.0, 0.0);
    }

    /*
     * Power test
     */
    @Test
    public void testPower(){
        assertEquals(1.0, Calculator.power(6.0, 0.0), 0.0001);
        assertEquals(256.0, Calculator.power(2.0, 8.0), 0.0001);
    }

    /*
     * Square root test
     */
    @Test
    public void testSqrt(){
        assertEquals(Double.NaN, Calculator.sqrt(-1.0), 0.0001);
        assertEquals(16.0, Calculator.sqrt(256.0), 0.0001);
    }
}
