package ru.lkhayrullin.trackersuite.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.lkhayrullin.trackersuite.screens.*

sealed class NavRoute(val route: String) {
    object Start: NavRoute("start_screen")
    object Find: NavRoute("find_screen")
    object Lora: NavRoute("lora_screen")
    object Lorabeacon: NavRoute("lorabeacon_screen")
    object Lorawan: NavRoute("lorawan_screen")
}

@Composable
fun SuiteNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Start.route) {
        composable(NavRoute.Start.route) { StartScreen(navController = navController) }
        composable(NavRoute.Find.route) { FindScreen(navController = navController) }
        composable(NavRoute.Lora.route) { LoraScreen(navController = navController) }
        composable(NavRoute.Lorabeacon.route) { LoraBeaconScreen(navController = navController) }
        composable(NavRoute.Lorawan.route) { LoraWanScreen(navController = navController) }
    }
}