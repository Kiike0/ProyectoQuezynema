package com.example.proyectofinal_quizynema.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navegacionsalir.NavegacionSalir
import com.example.proyectofinal_quizynema.preguntaquiz.PreguntaQuiz
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp

@Composable
fun PantallaPregunta1(
    //navController: NavHostController //,
    //viewModel: MenuInicioViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        NavegacionSalir(
            modifier = Modifier
                .size(300.dp, 90.dp)
                .align(Alignment.CenterHorizontally),
            questionNum = "Primera Pregunta",
            onExitButton = {}
        )
        PreguntaQuiz(
            modifier = Modifier.size(400.dp, 650.dp),
            imgQuestionImageContent = painterResource(id = R.drawable.pregunta_quiz_img_question),
            questionDesc = "",
            question1 = "",
            question2 = "",
            question3 = "",
            question4 = "",
            confirmAnswer = "",
            onQuestion1Button = {},
            onQuestion2Button = {},
            onQuestion3Button = {},
            onQuestion4Button = {},
            onButtonConfirm = {}
        )


    }
}