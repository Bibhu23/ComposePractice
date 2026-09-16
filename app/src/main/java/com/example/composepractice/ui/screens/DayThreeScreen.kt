package com.example.composepractice.ui.screens


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

//State Hoisting is the pattern of removing state from a Composable and "hoisting" (moving) it up to a parent component or caller.

// ==========================================
// DAY 3: STATEFUL COMPOSABLE (Holds the State)
// ==========================================
@Composable
fun DayThreeScreen(modifier: Modifier = Modifier) {
    // 1. State lives here at the top level
    var clickCount by remember { mutableStateOf(0) }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.LightGray)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderSection(
                title = "Day 3: State Hoisting",
                subtitle = "Separating Stateful & Stateless Composables"
            )

            Spacer(modifier = Modifier.height(24.dp))

            // 2. We pass state DOWN and events UP to our Stateless Composable
            StatelessCounter(
                count = clickCount,
                onIncrement = { clickCount++ } // Event flows UP
            )
        }
    }
}

// ==========================================
// DAY 3: STATELESS COMPOSABLE (No 'remember')
// ==========================================
@Composable
fun StatelessCounter(
    count: Int,               // State flowing DOWN
    onIncrement: () -> Unit   // Event flowing UP (Callback lambda)
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Button clicked $count times",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // When clicked, triggers the callback lambda sent from parent
        Button(onClick = onIncrement) {
            Text("Click Me (Stateless)")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DayThreeScreenPreview() {
    ComposePracticeTheme {
        DayThreeScreen()
    }
}