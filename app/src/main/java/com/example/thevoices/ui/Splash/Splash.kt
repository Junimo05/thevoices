package com.example.thevoices.ui.Splash

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.thevoices.utils.Navigator.MainScreen

@Composable
fun SplashScreen(navController: NavController) {
    Splash(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Splash(
    navController: NavController,
    modifier: Modifier = Modifier
){
    val TAG = "Splash_Screen"
    Scaffold {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Splash")
            Button(onClick = { navController.navigate(MainScreen.HomeScreen.route)}) {
                Text(text = "Go to Home")
//                Log.e(TAG, navController.currentDestination.toString())
            }
            Button(onClick = { navController.navigate(MainScreen.HomeScreen.route)}) {
                Text(text = "Go to PostDetail")
//                Log.e(TAG, navController.currentDestination.toString())
            }
        }
    }
}