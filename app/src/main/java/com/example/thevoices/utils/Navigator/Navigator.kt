package com.example.thevoices.utils.Navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destination.SplashScreen){
        authGraph(navController) //authentication nav
        mainGraph(navController) //home nav
    }
}