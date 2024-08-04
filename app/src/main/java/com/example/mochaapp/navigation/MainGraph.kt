package com.example.mochaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mochaapp.presentation.StartScreen

@Composable
fun MainGraph (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "StartScreen") {
        composable("StartScreen"){
            StartScreen(navController = navController)
        }
        composable("NavigationScreen"){
            NavigationScreen()
        }
    }
}