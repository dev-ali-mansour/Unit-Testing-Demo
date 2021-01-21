package dev.alimansour.unittestingdemo;

/**
 * UnitTestingDemo Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- UnitTestingDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class Authentication {

    public boolean login(String username, String password) {
        if (username.toLowerCase().equals("user") && password.equals("123457")) {
            return true;
        }
        return false;
    }
}