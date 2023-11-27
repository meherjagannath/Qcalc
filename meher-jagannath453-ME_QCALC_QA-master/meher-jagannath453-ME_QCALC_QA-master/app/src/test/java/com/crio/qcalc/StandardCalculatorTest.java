package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {

    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

//test case for standardCALCULATOR

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(10,5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);

    }

    @Test
    @DisplayName("Test Division Divide By Zero Scenario")

    void testDivisionDivideByZero(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.divide(10,0);
            }
        });
    }
 

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(10,2);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(20, actualResult);
        
    }

    //new implementation for throw test

    
    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Division Overflow of Two Doubles")
    void testDivisionOverflowForDoubles() {
        Assertions.assertThrows(ArithmeticException.class,new Executable()  {
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
            }     
        });
    }

    // //new test case for ScientificCalculator

    
    // @Test
    // @DisplayName("Test Sin Operation")
    // void testSinOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.sin(Math.PI / 6);
    //     double expected = 0.5;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    // @Test
    // @DisplayName("Test Cos Operation")
    // void testCosOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.cos(Math.PI / 3);
    //     double expected = 0.5;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    // @Test
    // @DisplayName("Test Square Operation")
    // void testSquareOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.square(4.0);
    //     double expected = 16.0;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    

    // @Test
    // @DisplayName("Test Tan Operation")
    // void testTanOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.tan(Math.PI / 4);
    //     double expected = 1.0;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    // @Test
    // @DisplayName("Test Log Operation")
    // void testLogOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.log(10.0);
    //     double expected = 2.302585092994046;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    // @Test
    // @DisplayName("Test Square Root Operation")
    // void testSqrtOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();
    //     calculator.sqrt(25.0);
    //     double expected = 5.0;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }

    // @Test
    // @DisplayName("Test Cube Root Operation")
    // void testCbrtOperation() {
    //     ScientificCalculator calculator = new ScientificCalculator();

    //     calculator.cbrt(27.0);
    //     double expected = 3.0;
    //     Assertions.assertEquals(expected, calculator.getResult(), 0.0001);
    // }
    
    }


