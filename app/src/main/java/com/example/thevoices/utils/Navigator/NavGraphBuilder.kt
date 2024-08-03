package com.example.thevoices.utils.Navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.thevoices.presentations.components.PostComponent.PostDetail
import com.example.thevoices.ui.HomeScreen
import com.example.thevoices.ui.Splash.SplashScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(route = Graph.AUTHENTICATION, startDestination = AuthScreen.SplashScreen.route){
        composable(route = AuthScreen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = AuthScreen.LoginScreen.route){

        }
        composable(route = AuthScreen.RegisterScreen.route){

        }
        composable(route = AuthScreen.ForgetPasswordScreen.route){

        }
    }
}

fun NavGraphBuilder.mainGraph(navController: NavController){
    navigation(route = Graph.NAV_SCREEN, startDestination = MainScreen.HomeScreen.route){
        composable(route = MainScreen.HomeScreen.route){
            HomeScreen(navController = navController)
        }
    }
}
