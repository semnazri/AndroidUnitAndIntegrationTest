package com.semnazri.androidunitintegrationtest

import org.junit.Assert
import org.junit.Test

class LoginValidatorTest {
    @Test
    fun testValidEmail() {
        Assert.assertTrue(LoginValidator.isEmailValid("user@example.com"))
    }

    @Test
    fun testInvalidEmail() {
        Assert.assertFalse(LoginValidator.isEmailValid("invalid_email"))
    }

    @Test
    fun testValidPassword() {
        Assert.assertTrue(LoginValidator.isPasswordValid("validPassword"))
    }

    @Test
    fun testInvalidPassword() {
        Assert.assertFalse(LoginValidator.isPasswordValid("short"))
    }
}