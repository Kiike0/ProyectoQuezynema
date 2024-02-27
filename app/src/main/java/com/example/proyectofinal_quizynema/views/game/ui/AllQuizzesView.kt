package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.QuizCardComposable

@Composable
fun AllQuizzesView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel,
    quizVM: QuizViewModel
) {

    val quizIdsList: ArrayList<String> by quizVM.quizIdsList.observeAsState(ArrayList())
    //val quizList: List<String> by quizVM.quizTitles.observeAsState(emptyList())


    LaunchedEffect(Unit) {
        currentUserViewModel.getNickname()
        quizVM.fetchQuiz()
    }

    val datos by quizVM.quizData.collectAsState()

    //var miListaMutable: MutableList<String> = mutableListOf()
    // IMPORTANTE: Si intentamos acceder a miArrayList[0] no funciona, se rompe el programa
    // Por esa razon se pasa a "JSON"
    val miArrayList = ArrayList<String>()

    datos.forEach { item ->
        miArrayList.add(item.title)
    }

    val nuevaListaJSON = miArrayList.toString()

    // Elimina los corchetes "[" y "]" del principio y final de la cadena
    val jsonSinCorchetes = nuevaListaJSON.substring(1, nuevaListaJSON.length - 1)
    // Divide la cadena por las comas para obtener los valores individuales
    val valores = jsonSinCorchetes.split(", ")
    // Accede al primer valor de la lista
    val primerValor = valores[0]
    // IMPORTANTE: Usamos getOrNull para evitar excepciones si el índice está fuera de los límites
    // Si no hacemos esto se rompe el programa
    val segundoValor = valores.getOrNull(1)


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        Navegacion(
            modifier = Modifier
                .size(300.dp, 120.dp)
                .align(Alignment.Start),
            textNav = "Quiz Disponibles",
            onBack = { navController.navigate(Routes.HomeScreen.route) }
        )
        LazyColumn {
            items(2) {
                Row() {
                    QuizCardComposable(
                        modifier = Modifier
                            .size(155.dp, 200.dp),
                        quizImg = painterResource(R.drawable.quiz_explored_quiz_img),
                        quizTitleText = "$primerValor",
                        onBoxQuiz = {
                            //quizVM.changeQuizId(quizIdsList[0])
                            navController.navigate(Routes.QuizScreen.route)
                        },
                        onQuizImg = {
                            quizVM.changeQuizId(quizIdsList[0])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(25.dp))
                    QuizCardComposable(
                        modifier = Modifier.size(155.dp, 200.dp),
                        quizImg = painterResource(R.drawable.quiz_explored_quiz_img),
                        quizTitleText = "$segundoValor",
                        onBoxQuiz = { navController.navigate(Routes.AddQuizScreen.route) },
                        onQuizImg = {
                            quizVM.changeQuizId(quizIdsList[1])
                            navController.navigate(Routes.QuizScreen.route)

                        }
                    )
                }
            }

        }


    }
}