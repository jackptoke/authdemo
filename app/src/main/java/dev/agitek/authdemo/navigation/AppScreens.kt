package dev.agitek.authdemo.navigation

enum class AppScreens {
    HomeScreen,
    PostDetailScreen,
    LoginScreen;

    companion object {
        fun fromRoute(route: String?) : AppScreens = when(route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            PostDetailScreen.name -> PostDetailScreen
            LoginScreen.name -> LoginScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}