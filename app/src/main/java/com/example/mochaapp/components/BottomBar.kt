package com.example.mochaapp.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.mochaapp.navigation.BottomBarScreen

@Composable
fun BottomBar(navController: NavHostController){

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Favorite,
        BottomBarScreen.Cart
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val  currentDestination = navBackStackEntry?.destination

    NavigationBar() {
        screens.forEach {
                screen ->
            AddItem(screen = screen, currentDestination = currentDestination , navController = navController )
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
){
    NavigationBarItem(
        label = { Text(text = screen.title ) } ,
        onClick = {
            navController.navigate(screen.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = screen.title
            ) },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true
    )
}