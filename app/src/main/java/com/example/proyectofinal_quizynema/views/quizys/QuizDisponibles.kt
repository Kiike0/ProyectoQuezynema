package com.example.proyectofinal_quizynema.views.quizys

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.quizexplored.QuizExplored
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp


@Composable
fun QuizDisponibles(
    //navController: NavHostController //,
    //viewModel: MenuInicioViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        Navegacion(
            modifier = Modifier.size(300.dp,100.dp),
            textNav = "Quiz Disponibles",
            onBack = {}
        )
        QuizExplored(
            modifier = Modifier.size(200.dp,200.dp),
            quizImg = {},
            quizTitle = {}
        )
    }
}

