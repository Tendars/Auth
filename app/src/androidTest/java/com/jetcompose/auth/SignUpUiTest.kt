package com.jetcompose.auth

import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.registerloginapp.MainActivity
import com.example.registerloginapp.store.presentation.signupscreen.SignUpUi
import com.example.registerloginapp.ui.theme.RegisterLoginAppTheme
import org.junit.Rule
import org.junit.Test

class SignUpUiTest {
    @get:Rule
    val composeTestRule = createComposeRule()
//    val composeTestRule = createAndroidComposeRule<MainActivity>()
    // use createAndroidComposeRule<YourActivity>() if you need access to
    // an activity

    @Test
    fun testTextField(){
        // Start the app
        composeTestRule.setContent {
            RegisterLoginAppTheme {
                SignUpUi()
            }

//                SignUpUi(uiState = fakeUiState, /*...*/)
//                SignUpUi()

        }
        val someText ="Hey there"
        composeTestRule.onNodeWithTag("my_FullNames").performTextInput("${someText}")
        composeTestRule.onNodeWithTag("my_FullNames").assertTextContains("${someText}")
        val someTextE ="Hey there yap"
        composeTestRule.onNodeWithTag("my_Email").performTextInput("${someText}")
        composeTestRule.onNodeWithTag("my_Email").assertTextContains("${someText}")


    }

    @Test
    fun myButton(){
        composeTestRule.setContent {
            RegisterLoginAppTheme {
                SignUpUi()
            }

//                SignUpUi(uiState = fakeUiState, /*...*/)
//                SignUpUi()

        }
        composeTestRule.onNodeWithTag("my_Button").performClick()
        composeTestRule.onNodeWithText("you are done").assertExists()

    }
}