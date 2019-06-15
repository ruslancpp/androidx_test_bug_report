package com.infiniteset.testlibrary

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.infiniteset.mixed.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestActivityExt {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testMainActivityExt() {
        onView(withId(com.infiniteset.mixed.R.id.edt_some))
            .perform(ViewActions.typeText("Test passed"), ViewActions.closeSoftKeyboard())
    }
}
