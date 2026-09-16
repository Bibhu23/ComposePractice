package com.example.composepractice.ui.screens

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.components.HeaderSection
import com.example.composepractice.ui.theme.ComposePracticeTheme

@Composable
fun DayTwoScreen(modifier: Modifier= Modifier){
    // Day 2 Topic: State & Recomposition using remember and mutableStateOf
    var clickCount by remember { mutableIntStateOf(0) }
    Surface(
        modifier=modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier= Modifier.fillMaxSize().background(color = Color.LightGray).padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderSection(
                title = "Day2 : state & Interactivity",
                subtitle = "Learning remember,substitutable & Recomposition"
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Button clicked $clickCount times",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(16.dp))
            // Interactive Button
            Button(onClick={clickCount++}){
                Text("click me!")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DayTwoScreenPreview(){
    ComposePracticeTheme {
      DayTwoScreen()
    }
}
