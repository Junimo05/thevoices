package com.example.thevoices.utils.Navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.thevoices.presentations.View.Home
import com.example.thevoices.presentations.View.HomeScreen
import com.example.thevoices.presentations.View.LoginScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation<SubGraph.Auth>(startDestination = Destination.SplashScreen){
        composable<Destination.SplashScreen>{
            HomeScreen(navController = navController)
        }
        composable<Destination.LoginScreen> {

        }
        composable<Destination.RegisterScreen> {

        }
        composable<Destination.ForgetPasswordScreen> {

        }
    }
}

fun NavGraphBuilder.mainGraph(navController: NavController){
    navigation<SubGraph.Main>(startDestination = Destination.HomeScreen){
        composable<Destination.HomeScreen> {

        }
    }
}