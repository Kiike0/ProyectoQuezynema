package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.inicioquiz.InicioQuiz
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

@Composable
fun QuizView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        InicioQuiz(
            modifier = Modifier.size(400.dp, 700.dp),
            startText = "Iniciar",
            quizTitleText = "¿Lo sabes todo sobre Star Wars?",
            quizDesc = "Responde a las preguntas del Quiz y ganarás puntos por respuesta correcta",
            onStartButton = { navController.navigate(Routes.Question1Screen.route) }
        )
    }
}