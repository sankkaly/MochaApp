package com.example.mochaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mochaapp.presentation.CartScreen
import com.example.mochaapp.presentation.FavScreen
import com.example.mochaapp.presentation.MainScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route){
            MainScreen()
        }

        composable(route = BottomBarScreen.Favorite.route){
            FavScreen()
        }

        composable(route = BottomBarScreen.Cart.route){
            CartScreen()
        }
    }
}