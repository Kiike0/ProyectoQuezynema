package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.inicioquiz.InicioQuiz
import com.example.proyectofinal_quizynema.navegacionsalir.NavegacionSalir
import com.example.proyectofinal_quizynema.preguntaquiz.PreguntaQuiz
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

@Composable
fun Question1View(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        NavegacionSalir(
            modifier = Modifier.size(400.dp, 80.dp).align(Alignment.Start),
            textQuestionNumber = "1/5",
            onExit = {}
        )
        PreguntaQuiz(
            modifier = Modifier.size(400.dp, 800.dp),
            quizImg = painterResource(R.drawable.pregunta_quiz_quiz_img),
            quizTitle = "dsgsdfgg dsfgsdfg sdfg dsdfgsdfg",
            answerText1 = "gdsfgsdf gsdfgs",
            answerText2 = "gsdfgsdf gdfd sgsd ",
            answerText3 = "gsdf gs",
            answerText4 = "g sdfg ",
            onAnswerButton1 = {},
            onAnswerButton2 = {},
            onAnswerButton3 = {},
            onAnswerButton4 = {}
        )
    }
}