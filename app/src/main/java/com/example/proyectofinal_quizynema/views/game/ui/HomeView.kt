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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.quizexplored.QuizExplored
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedTextWhite
import com.example.proyectofinal_quizynema.views.components.CustomizedTextWhiteSmaller
import com.example.proyectofinal_quizynema.views.components.CustomizedWelcomeMessage
import com.example.proyectofinal_quizynema.views.components.GenreButton
import com.example.proyectofinal_quizynema.views.components.ProgresoBox
import com.example.proyectofinal_quizynema.views.components.QuizSugeridaMod


@Composable
fun HomeView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    // Una lista de strings que contienen el nombre del género musical
    val genres = listOf(
        "Años 80",
        "Ciencia Ficción",
        "Terror",
        "Drama",
        // Añade más géneros si quieres
    )
    //Lista inventada de las quiz del progreso
    val progresoBoxes = listOf(
        Triple("100", "Título de la pregunta 1") { /* Comportamiento del botón 1 */ },
        Triple("200", "Título de la pregunta 2") { /* Comportamiento del botón 2 */ },
        Triple("300", "Título de la pregunta 3") { /* Comportamiento del botón 3 */ }
        // Agrega más triples si es necesario
    )

    LaunchedEffect(Unit) {
        currentUserViewModel.fetchNickname()
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {

        CustomizedWelcomeMessage(
            greetings = "Buenos días, Senpai!",
            letsQuiz = "Hagamos una quiz hoy",
            avatarImg = { navController.navigate(Routes.UserScreen.route) }
        )
        Column (
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, top = 110.dp)
        ){
            QuizSugeridaMod(
                modifier = Modifier,
                img = painterResource(id = R.drawable.palomitas),
                onComenzarButton = {}
            )
            Spacer(modifier = Modifier.height(12.dp))
            CustomizedTextWhite(customizedText = "Géneros", Modifier)
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow {
                // Itera sobre la lista de strings y muestra un botón por cada uno
                itemsIndexed(genres) { index, genre ->
                    GenreButton(
                        genreText = genre,
                        onButtonGenre = {}
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }

            }
            Spacer(modifier = Modifier.height(12.dp))
            CustomizedTextWhite(customizedText = "Tu progreso", Modifier)
            Spacer(modifier = Modifier.height(12.dp))

            LazyRow {
                items(progresoBoxes.size) { index ->
                    val (points, quizTitle, onQuizButton) = progresoBoxes[index]
                    ProgresoBox(
                        points = points as String,
                        quizTitle = quizTitle as String,
                        onQuizButton = onQuizButton as () -> Unit
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(){
                CustomizedTextWhite(customizedText = "Quiz disponibles", Modifier)
                Spacer(modifier = Modifier.width(165.dp))
                CustomizedTextWhiteSmaller(customizedText = "Ver todas", Modifier.padding(top = 1.dp))
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(){
                QuizExplored(
                    modifier = Modifier.size(155.dp, 200.dp),
                    quizImg = {},
                    quizTitle = {}
                )
                Spacer(modifier = Modifier.width(25.dp))
                QuizExplored(
                    modifier = Modifier.size(155.dp, 200.dp),
                    quizImg = {},
                    quizTitle = {}
                )
            }
        }


    }
}

