package dev.agitek.authdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.agitek.authdemo.screens.home.HomeScreen
import dev.agitek.authdemo.screens.login.LoginScreen
import dev.agitek.authdemo.screens.posts.PostDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.HomeScreen.name ) {
        composable(AppScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(AppScreens.PostDetailScreen.name) {
            PostDetailScreen(navController = navController)
        }
        
        composable(AppScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
    }
}