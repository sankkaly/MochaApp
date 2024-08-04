package com.example.mochaapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun CartScreen (){

    Scaffold { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text(text = "Cart Screen")
        }
    }
}