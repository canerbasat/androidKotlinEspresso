package com.example.muko.kotlinespressotutorial


import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.anything
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.Rule



/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Rule
    @JvmField
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.muko.kotlinespressotutorial", appContext.packageName)
    }
    @Test
    fun checkCorrectly() {
        onView(withId(R.id.edtName)).perform(typeText("Mukaddes"))
        onView(withId(R.id.edtPass)).perform(typeText("123456"))
        onView(withId(R.id.edtMail)).perform(typeText("m.ddemirtas"))
        onView(withId(R.id.tvMessage)).check(matches(withText("Hello Espresso!")))
        onView(withId(R.id.spEmail)).perform(click())
        onData(anything()).atPosition(1).perform(click())
        onView(withId(R.id.btnLogin)).perform(click())
    }

}