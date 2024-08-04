package com.example.mochaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mochaapp.navigation.MainGraph
import com.example.mochaapp.navigation.NavigationScreen
import com.example.mochaapp.ui.theme.MochaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MochaAppTheme {
                    MainGraph()
                }
            }
        }
    }


