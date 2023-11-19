package com.semnazri.androidunitintegrationtest

import androidx.core.util.PatternsCompat

object LoginValidator {

    fun isEmailValid(email: String): Boolean {
        return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isPasswordValid(password: String): Boolean {
        return password.length >= 6
    }
}