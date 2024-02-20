package com.example.proyectofinal_quizynema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.Proyectofinal_quizynemaTheme
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.game.ui.HomeScreen
import com.example.proyectofinal_quizynema.views.game.ui.StartGameScreen
import com.example.proyectofinal_quizynema.views.login.Login
import com.example.proyectofinal_quizynema.views.login.Register

class MainActivity : ComponentActivity() {

    private val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyectofinal_quizynemaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.InitialScreen.route
                    ) {
                        composable(Routes.InitialScreen.route) {
                            StartGameScreen(
                                navController = navController
                            )
                        }
                        composable(Routes.AccessScreen.route) {
                            Login(
                                navController = navController,
                                accessViewModel = userViewModel
                            )
                        }
                        composable(Routes.RegisterScreen.route) {
                            Register(
                                navController = navController,
                                registerViewModel = userViewModel
                            )
                        }
                        composable(Routes.GameScreen.route) {
                            HomeScreen(
                                navController = navController,
                                currentUserViewModel = userViewModel
                            )
                        }
                    }
                    //QuizScreen(quizVM = ViewModelPrueba())
                    //RegisterView(newUser = UserViewModel())
                    //PantallaInicial()
                    //InicioSesion()
                    //Registro()
                    //PantallaJuego()
                    //QuizDisponibles()
                    //PantallaPregunta1()
                }
            }
        }
    }
}
