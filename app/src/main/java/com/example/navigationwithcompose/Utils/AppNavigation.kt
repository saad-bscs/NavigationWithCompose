package com.example.navigationwithcompose.Utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationwithcompose.Screens.HomeScreen
import com.example.navigationwithcompose.Screens.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.loginScreen, builder = {

        composable(Routes.loginScreen) {
            LoginScreen(navController)
        }

        composable(Routes.dashboardScreen + "/{name}") {
            val name = it.arguments?.getString("name")
            HomeScreen(name ?: "No Name")
        }
    })
}