package fr.nymphicus.basicjavacalculator;

import java.lang.Math;

public class Calculator {

    /**
     * Add two numbers
     * @param a first number
     * @param b second number
     * @return Addition of a and b
     */
    public static double addition(double a, double b){
        return a+b;
    }

    /**
     * Substract two numbers
     * @param a first number
     * @param b second number
     * @return Substraction of a by b
     */
    public static double substraction(double a, double b){
        return a-b;
    }

    /**
     * Multiply two numbers
     * @param a first number
     * @param b second number
     * @return Multiplication of a and b
     */
    public static double multiplication(double a, double b){
        return a*b;
    }

    /**
     * Divide a by b
     * @param a first number
     * @param b second number (not equal to 0)
     * @return Division of a by b
     */
    public static double division(double a, double b){
        if (b==0) {
            throw new ArithmeticException("Division by 0.");
        }
        return a/b;
    }

    /**
     * First number to the power of second
     * @param a first number
     * @param b second number
     * @return a to the power of b
     */
    public static double power(double a, double b){
        return Math.pow(a,b);
    }

    /**
     * Square root of the first number
     * @param a first number
     * @return square root of a
     */
    public static double sqrt(double a){
        return Math.sqrt(a);
    }
}