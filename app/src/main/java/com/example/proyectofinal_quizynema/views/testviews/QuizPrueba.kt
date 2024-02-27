package com.example.proyectofinal_quizynema.views.testviews

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel

/**
 * Vista composable para la pantalla principal de la aplicación. Muestra una lista de notas y permite
 * al usuario añadir nuevas notas o editarlas.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(quizVM: QuizViewModel) {
    // DCS - Estructura de la interfaz de la pantalla principal con una lista de notas y acciones para añadir o editar.

    /*LaunchedEffect(Unit){
        quizVM.fetchQuiz()
    }

     */
    /*
    val state by quizVM.state.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        when (state) {
            is QuizState.Loading -> Text(text = "Loading...")
            is QuizState.Success -> {
                val quiz = (state as QuizState.Success).quiz
                Text(text = quiz.title)
                val questions = listOf(quiz.question1, quiz.question2, quiz.question3, quiz.question4)
                for (i in 0..3) {
                    questions[i]?.forEachIndexed { index, option ->
                        when (index) {
                            0 -> Text(text = option) // Esto muestra la pregunta
                            else -> Text(text = option) // Esto muestra las opciones
                        }
                    }
                }
            }
            is QuizState.Error -> Text(text = (state as QuizState.Error).message, color = Color.Red)
        }
        // Aquí puedes poner otros componentes que quieras mostrar en la composable
    }
}


    /*Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val datos by quizVM.quizModel.collectAsState()

        LazyColumn{
            items(datos){ item ->
                Text(text = item.title ?: "")
                //item.question1?.let { Text(text = it[0]) }
            }
        }
    }

     */

     */
}


