package com.semnazri.androidunitintegrationtest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class LoginValidationActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testValidEmailAndPassword() {
        Espresso.onView(withId(R.id.email_field)).perform(ViewActions.typeText("user@example.com"))
        Espresso.onView(withId(R.id.password_field))
            .perform(ViewActions.typeText("validPassword"), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_login)).perform(ViewActions.click())
    }

    @Test
    fun testInvalidEmail() {
        Espresso.onView(withId(R.id.email_field)).perform(ViewActions.typeText("invalid_email"))
        Espresso.onView(withId(R.id.password_field))
            .perform(ViewActions.typeText("validPassword"), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_login)).perform(ViewActions.click())
    }

    @Test
    fun testInvalidPassword() {
        Espresso.onView(withId(R.id.email_field)).perform(ViewActions.typeText("user@example.com"))
        Espresso.onView(withId(R.id.password_field))
            .perform(ViewActions.typeText("short"), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_login)).perform(ViewActions.click())
    }
}