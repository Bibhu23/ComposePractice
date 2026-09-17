package com.example.composepractice.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.theme.ComposePracticeTheme

@Composable
fun DayFiveScreen(
    modifier: Modifier = Modifier,
    viewModel: DayFiveViewModel = remember{ DayFiveViewModel() } // Uses viewModel() factory
) {
    // Collects StateFlow from ViewModel (like Obx in Flutter)
    val count by viewModel.count.collectAsState()

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center, // Single '='
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Count: $count")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { viewModel.increment() }) {
                Text("Increment")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DayFiveScreenPreview() {
    ComposePracticeTheme() {
        DayFiveScreen()
    }
}