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
public class AuthenticationTest {
    private Authentication SUT = new Authentication();


    @Test
    public void testLogin_withEmptyUsernameAndPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("", "");
        assertEquals(false, isAuthenticated);
    }

    @Test
    public void testLogin_withEmptyUsernameAndFilledPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("", "123456");
        assertEquals(false, isAuthenticated);
    }

    @Test
    public void testLogin_withFilledUsernameAndEmptyPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("user", "");
        assertEquals(false, isAuthenticated);
    }

    @Test
    public void testLogin_withValidUsernameAndValidPassword_returnTrue() {
        boolean isAuthenticated = SUT.login("user", "123457");
        assertEquals(true, isAuthenticated);
    }

    @Test
    public void testLogin_withValidUsernameAndInvalidPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("user", "654321");
        assertEquals(false, isAuthenticated);
    }

    @Test
    public void testLogin_withInvalidUsernameAndValidPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("Userx", "123457");
        assertEquals(false, isAuthenticated);
    }

    @Test
    public void testLogin_withInvalidUsernameAndPassword_returnFalse() {
        boolean isAuthenticated = SUT.login("User", "654321");
        assertEquals(false, isAuthenticated);
    }
}
