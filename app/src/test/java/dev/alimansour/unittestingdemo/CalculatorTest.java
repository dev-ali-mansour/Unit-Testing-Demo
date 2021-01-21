package dev.alimansour.unittestingdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * UnitTestingDemo Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- UnitTestingDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class CalculatorTest {
    private Calculator SUT = new Calculator();

    @Test
    public void testSum(){
        double result = SUT.sum(25,63);
        assertEquals(88,result,0);
    }

    @Test
    public void testMultiply() {
        double result = SUT.multiply(5, 6);
        assertEquals(30, result, 0);
    }

    @Test
    public void testDivide() {
        double result = SUT.divide(50, 4);
        assertEquals(12.5, result, 0);
    }
    @Test
    public void testSubtract() {
        double result = SUT.subtract(20, 12);
        assertEquals(8, result, 0);
    }@Test
    public void testMod() {
        double result = SUT.mod(20, 6);
        assertEquals(2, result, 0);
    }
}