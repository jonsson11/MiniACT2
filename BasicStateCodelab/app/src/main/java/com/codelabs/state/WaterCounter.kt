package com.codelabs.state

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding


@Composable
fun WaterCounter (modifier : Modifier = Modifier) {
    val count = 0
    Text(
        text = "You drinked $count glasses.",
        modifier = modifier.padding(16.dp)
    )
}