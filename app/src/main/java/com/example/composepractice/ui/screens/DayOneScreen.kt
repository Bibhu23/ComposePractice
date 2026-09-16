package com.example.composepractice.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.components.HeaderSection
import com.example.composepractice.ui.theme.ComposePracticeTheme

/**
 * ==========================================
 * DAY 1: Layouts, Modifiers & Custom Composables
 * ==========================================
 */
@Composable
fun DayOneScreen(modifier: Modifier = Modifier) {
    // 1. Surface: A container widget that applies theme background colors and shapes (like Scaffold/Container in Flutter)
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        // 2. Column: Stacks items vertically (equivalent to Flutter Column)
        // 3. Modifier: Chains styling, sizing, and padding.
        //    Golden Rule tested here: .fillMaxSize() -> .background() -> .padding() (order matters!)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.LightGray)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,   // Equivalent to Flutter mainAxisAlignment: Center
            horizontalAlignment = Alignment.CenterHorizontally // Equivalent to Flutter crossAxisAlignment: Center
        ) {
            // 4. Custom Reusable Composable (Extracted to ui/components/HeaderSection.kt)
            HeaderSection(
                title = "wlcm to Jetpack compose",
                subtitle = "Since you know Flutter, you'll master this in no time"
            )

            // 5. Spacer: Adds empty fixed spacing (equivalent to Flutter SizedBox)
            Spacer(modifier = Modifier.height(16.dp))

            // 6. Row: Stacks items horizontally (equivalent to Flutter Row)
            //    Arrangement.spacedBy adds automatic spacing between row items!
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(onClick = { /* Action 1 */ }) {
                    Text("Learn More")
                }
                OutlinedButton(onClick = { /* Action 2 */ }) {
                    Text("Skip")
                }
            }
        }
    }
}

/**
 * 7. @Preview annotation:
 * Allows inspecting and testing the UI instantly inside Android Studio's preview pane without running an emulator.
 */
@Preview(showBackground = true)
@Composable
fun DayOneScreenPreview() {
    ComposePracticeTheme {
        DayOneScreen()
    }
}