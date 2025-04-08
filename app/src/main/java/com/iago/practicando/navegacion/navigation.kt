package com.iago.practicando.navegacion
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.iago.practicando.screens.Screen1
import com.iago.practicando.screens.Screen2
import com.iago.practicando.screens.Screen3

@Composable


fun Navigation() {
    val navigationController = rememberNavController()

    NavHost(navController = navigationController, startDestination = Screen1) {
        composable<Screen1> {
            Screen1 {
                navigationController.navigate(Screen2) {
                    navigationController.popBackStack()
                }
            }
        }
        composable<Screen2> {
            Screen2 { valorAPasarle ->
                navigationController.navigate(Screen3(valorAPasarle))
            }
        }
        composable<Screen3> { backStackEntry ->
            val screen3 = backStackEntry.toRoute<Screen3>()
            Screen3(screen3.valorAPasarle) { navigationController.navigate(Screen1) }
        }

    }
}
