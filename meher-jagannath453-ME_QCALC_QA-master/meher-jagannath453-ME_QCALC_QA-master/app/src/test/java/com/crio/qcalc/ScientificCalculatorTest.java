package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {
    
    private ScientificCalculator scientificCalculator;

    @BeforeEach
    void setup(){
        scientificCalculator = new ScientificCalculator();
    }

    //new test case for ScientificCalculator

    
    @Test
    @DisplayName("Test Sin Operation")
    void testSinOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.sin(Math.PI / 6);
        double expected = 0.5;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    @Test
    @DisplayName("Test Cos Operation")
    void testCosOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.cos(Math.PI / 3);
        double expected = 0.5;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    @Test
    @DisplayName("Test Square Operation")
    void testSquareOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.square(4.0);
        double expected = 16.0;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    

    @Test
    @DisplayName("Test Tan Operation")
    void testTanOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.tan(Math.PI / 4);
        double expected = 1.0;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    @Test
    @DisplayName("Test Log Operation")
    void testLogOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.log(10.0);
        double expected = 2.302585092994046;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    @Test
    @DisplayName("Test Square Root Operation")
    void testSqrtOperation() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.sqrt(25.0);
        double expected = 5.0;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }

    @Test
    @DisplayName("Test Cube Root Operation")
    void testCbrtOperation() {
        ScientificCalculator calculator = new ScientificCalculator();

        calculator.cbrt(27.0);
        double expected = 3.0;
        Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    }
}
