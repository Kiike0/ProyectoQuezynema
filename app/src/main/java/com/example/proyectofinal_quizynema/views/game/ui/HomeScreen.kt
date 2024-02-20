package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.botongenre.BotonGenre
import com.example.proyectofinal_quizynema.progresoquiz.ProgresoQuiz
import com.example.proyectofinal_quizynema.quizexplored.QuizExplored
import com.example.proyectofinal_quizynema.quizsugerida.QuizSugerida
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.welcomemsj.WelcomeMsj


@Composable
fun HomeScreen(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        WelcomeMsj(
            modifier = Modifier.size(400.dp, 150.dp),
            greetings = "Buenos días, ${currentUserViewModel.nickname}!",
            letsQuiz = "Hagamos una quiz hoy",
            avatarImg = {}
        )
        QuizSugerida(
            modifier = Modifier.size(400.dp, 120.dp),
            quizsuggest = "Empieza una quiz elegida al azar",
            comenzar = "Comenzar",
            img = painterResource(id = R.drawable.palomitas),
            onComenzarButton = {}
        )
        BotonGenre(
            modifier = Modifier.size(400.dp, 100.dp),
            genreText = "Años 80",
            onButtonGenre = {}
        )

        ProgresoQuiz(
            modifier = Modifier.size(400.dp, 100.dp),
            points = "3/10",
            quizTitle = "¿Lo sabes todo sobre Star Wars",
            onQuizButton = {}
        )
        QuizExplored(
            modifier = Modifier.size(200.dp, 200.dp),
            quizImg = {},
            quizTitle = {}
        )

    }
}
