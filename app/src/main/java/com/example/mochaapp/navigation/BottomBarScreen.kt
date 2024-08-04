package com.example.mochaapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Favorite: BottomBarScreen(
        route = "Favorite",
        title = "Favorite",
        icon = Icons.Default.FavoriteBorder
    )
    object Cart: BottomBarScreen(
        route = "Cart",
        title = "Cart",
        icon = Icons.Default.ShoppingCart
    )
}