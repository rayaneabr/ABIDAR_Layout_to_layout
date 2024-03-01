package iut.abidar.exo1.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Layout1" ){
        composable(route ="Layout1") {
            layoutOne(navController)
        }
        composable(route ="Layout2") {
            layoutTwo(navController)
        }
        composable(route ="Layout3") {
            layoutThree(navController)
        }
    }
}
