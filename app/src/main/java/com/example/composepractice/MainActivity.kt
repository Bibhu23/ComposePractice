package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.composepractice.ui.screens.DayFiveScreen
import com.example.composepractice.ui.screens.DayFourScreen
import com.example.composepractice.ui.screens.DayOneScreen
import com.example.composepractice.ui.screens.DayThreeScreen
import com.example.composepractice.ui.screens.DayTwoScreen
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ComposePracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    DayOneScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    ),
//                    DayTwoScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    DayThreeScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                      DayFourScreen(
//                          modifier = Modifier.padding(innerPadding)
//                      )
                    DayFiveScreen(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}