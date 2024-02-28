package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.AddQuizComposable

/**
 * Función composable que representa la pantalla para crear una quiz.
 *
 * NOTA IMPORTANTE: Si no se ve tu quiz agregada, agrega otra, porque el tamaño de la coleccion de
 * quiz debe ser par para que se vea en Quiz disponibles, una vez sea par, ya se verán ambas creadas.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param newUserVM El ViewModel responsable de gestionar la lógica del usuario.
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
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