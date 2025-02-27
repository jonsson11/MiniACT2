package com.codelabs.state

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue


@Composable
fun WaterCounter (modifier : Modifier = Modifier) {
    Column (modifier = modifier.padding(16.dp)){
        var count by rememberSaveable{ mutableStateOf(0) }

        if (count > 0) {
            Text(text = "You drank $count glasses.")
        }
        Button(onClick = {count++}, modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one glass")
        }

    }
}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count < 0) {
            Text(text = "You drank $count glasses.")
        }
        Button(onClick = onIncrement, modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one glass")
        }
    }
}

@Composable
fun StatefullCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, {count++}, modifier)
}