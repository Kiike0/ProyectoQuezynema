package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.AddQuizComposable
import com.example.proyectofinal_quizynema.views.components.RegisterComposable

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun AddQuizView(
    navController: NavHostController,
    newUserVM: UserViewModel,
    quizVM: QuizViewModel
) {
    AddQuizComposable(
        navController = navController,
        quizVM = quizVM
    )
}