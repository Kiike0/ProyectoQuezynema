package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.quizexplored.QuizExplored
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedBigTextWhite
import com.example.proyectofinal_quizynema.views.components.CustomizedTextWhite
import com.example.proyectofinal_quizynema.views.components.CustomizedTextWhiteSmaller
import com.example.proyectofinal_quizynema.views.components.CustomizedWelcomeMessage
import com.example.proyectofinal_quizynema.views.components.GenreButton
import com.example.proyectofinal_quizynema.views.components.PopularQuiz
import com.example.proyectofinal_quizynema.views.components.QuizSugeridaMod
import com.example.proyectofinal_quizynema.welcomemsj.WelcomeMsj


@Composable
fun HomeView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {

    //Lista inventada de las quiz del progreso
    val progresoBoxes = listOf(
        Triple("10 completadas", "Título de la pregunta 1") { /* Comportamiento del botón 1 */ },
        Triple("20 completadas", "Título de la pregunta 2") { /* Comportamiento del botón 2 */ },
        Triple("30 completadas", "Título de la pregunta 3") { /* Comportamiento del botón 3 */ }
        // Agrega más triples si es necesario
    )

    LaunchedEffect(Unit) {
        currentUserViewModel.getNickname()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        CustomizedWelcomeMessage(
            modifier = Modifier,
            greetings = "Buenos días, ${currentUserViewModel.getSaludo()}!",
            letsQuizText = "Hagamos una quiz hoy",
            onQuizyAvatarImg = { navController.navigate(Routes.UserScreen.route) }
        )

        Column (
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, top = 110.dp)
        ){
            Spacer(modifier = Modifier.height(20.dp))
            QuizSugeridaMod(
                modifier = Modifier,
                img = painterResource(id = R.drawable.palomitas),
                onComenzarButton = {}
            )
            Spacer(modifier = Modifier.height(20.dp))
            CustomizedBigTextWhite(customizedText = "Quiz Populares", Modifier)
            Spacer(modifier = Modifier.height(20.dp))
            LazyRow {
                items(progresoBoxes.size) { index ->
                    val (times, quizTitle, onQuizButton) = progresoBoxes[index]
                    PopularQuiz(
                        times = times as String,
                        quizTitle = quizTitle as String,
                        onQuizButton = onQuizButton as () -> Unit
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(){
                CustomizedBigTextWhite(customizedText = "Quiz disponibles", Modifier)
                Spacer(modifier = Modifier.width(185.dp))
                CustomizedTextWhiteSmaller(customizedText = "Ver todas", Modifier.padding(top = 1.dp))
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(){
                QuizExplored(
                    modifier = Modifier.size(155.dp, 200.dp).clip(RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)),
                    quizImg = painterResource(R.drawable.quiz_explored_quiz_img),
                    quizTitleText = "Título de la quiz",
                    onBoxQuiz = {},
                    onQuizImg = { navController.navigate(Routes.QuizScreen.route) }
                )
                Spacer(modifier = Modifier.width(25.dp))
                QuizExplored(
                    modifier = Modifier.size(155.dp, 200.dp),
                    quizImg = painterResource(R.drawable.quiz_explored_quiz_img),
                    quizTitleText = "Título de la quiz",
                    onBoxQuiz = {},
                    onQuizImg = {}
                )

            }
        }


    }
}

