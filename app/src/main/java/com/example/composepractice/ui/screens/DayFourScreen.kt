package com.example.composepractice.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.components.HeaderSection
import com.example.composepractice.ui.theme.ComposePracticeTheme

@Composable
fun DayFourScreen(modifier: Modifier = Modifier) {
    // Sample list of items (In a real app, this would come from your backend API!)
    val fruitList = listOf("Apple 🍎", "Banana 🍌", "Cherry 🍒", "Grapes 🍇", "Orange 🍊", "Mango 🥭", "Pineapple 🍍", "Strawberry 🍓")
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.LightGray).padding(16.dp)
        ) {
            HeaderSection(
                title = "Day 4: Lazy Lists",
                subtitle = "Rendering efficient lists with LazyColumn"
            )
            // LazyColumn is Compose's efficient ListView.builder
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(top = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp) // Space between list items
            ) {
                items(fruitList){
                    fruit -> FruitItemCard(fruitName=fruit)
                }
            }
        }
    }
}

@Composable
fun FruitItemCard(fruitName: String){
    Card(
        modifier = Modifier.fillMaxSize(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Text(
            text = fruitName,
            style= MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DayFourScreenPreview(){
    ComposePracticeTheme() {
        DayFourScreen()
    }
}