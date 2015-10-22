package idomeneus.duo

import android.app.Activity
import android.test.ActivityInstrumentationTestCase2
import android.util.Log
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

/**
 * [Testing Fundamentals](http://d.android.com/tools/testing/testing_android.html)
 */

public class QuestionStructureTest(activityClass: Class<MainActivity>?) : ActivityInstrumentationTestCase2<MainActivity>(activityClass) {

    public fun QuestionStructureTest() {
    }

    Before
    throws(Exception::class)
    override public fun setUp() {
        super.setUp()
    }

    Test
    throws(Exception::class)
    public fun testInit() {
        val inputStream: InputStream = Activity().getResources().getAssets().open("../../androidTest/kotlin/idomeneus/duo/MockedQuestions.json")
        val r: BufferedReader = BufferedReader(InputStreamReader(inputStream))

        val total: StringBuilder = StringBuilder()
        var line: String
        line = r.readLine()
        while (line != null) {
            total.append(line)
            line = r.readLine()
        }
        Log.i("Test", total.toString())
    }

    Test
    throws(Exception::class)
    public fun testGetQuestionWithId() {
    }
}