package com.example.thevoices.utils.Navigator

import kotlinx.serialization.Serializable

sealed class SubGraph {
    @Serializable
    data object Auth: SubGraph()
    @Serializable
    data object Main: SubGraph()

}

sealed class Destination() {
    @Serializable
    data object SplashScreen: Destination()
    @Serializable
    data object LoginScreen: Destination()
    @Serializable
    data object RegisterScreen: Destination()
    @Serializable
    data object ForgetPasswordScreen: Destination()

    @Serializable
    data object HomeScreen: Destination()
}