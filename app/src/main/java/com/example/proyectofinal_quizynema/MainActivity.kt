package com.example.proyectofinal_quizynema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.Proyectofinal_quizynemaTheme
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.game.ui.AddQuizView
import com.example.proyectofinal_quizynema.views.game.ui.AllQuizzesView
import com.example.proyectofinal_quizynema.views.game.ui.HomeView
import com.example.proyectofinal_quizynema.views.game.ui.QuestionView
import com.example.proyectofinal_quizynema.views.game.ui.QuizView
import com.example.proyectofinal_quizynema.views.game.ui.StartGameView
import com.example.proyectofinal_quizynema.views.game.ui.UserView
import com.example.proyectofinal_quizynema.views.login.EmptyView
import com.example.proyectofinal_quizynema.views.login.Login
import com.example.proyectofinal_quizynema.views.login.Register

class MainActivity : ComponentActivity() {

    private val userViewModel: UserViewModel by viewModels()
    private val quizViewModel: QuizViewModel by viewModels()
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
                        startDestination = Routes.EmptyScreen.route
                    ) {
                        composable(Routes.EmptyScreen.route) {
                            EmptyView(
                                navController = navController,
                                quizVM = quizViewModel
                            )
                        }
                        composable(Routes.StartGameScreen.route) {
                            StartGameView(
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
                                newUserVM = userViewModel
                            )
                        }
                        composable(Routes.HomeScreen.route) {
                            HomeView(
                                navController = navController,
                                currentUserViewModel = userViewModel,
                                quizVM = quizViewModel
                            )
                        }
                        composable(Routes.AllQuizzesScreen.route) {
                            AllQuizzesView(
                                navController = navController,
                                currentUserViewModel = userViewModel,
                                quizVM = quizViewModel
                            )
                        }
                        composable(Routes.AddQuizScreen.route) {
                            AddQuizView(
                                navController = navController,
                                newUserVM = userViewModel,
                                quizVM = quizViewModel
                            )
                        }
                        composable(Routes.UserScreen.route) {
                            UserView(
                                navController = navController,
                                currentUserViewModel = userViewModel
                            )
                        }
                        composable(Routes.QuizScreen.route) {
                            QuizView(
                                navController = navController,
                                currentUserViewModel = userViewModel,
                                quizVM = quizViewModel
                            )
                        }
                        composable(Routes.Question1Screen.route) {
                            QuestionView(
                                navController = navController,
                                currentUserViewModel = userViewModel,
                                quizVM = quizViewModel
                            )
                        }
                    }
                }
            }
        }
    }
}
