package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.navegacionsalir.NavegacionSalir
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.model.states.QuizState
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.painters.imageQuestionsResources
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.Congratulations
import com.example.proyectofinal_quizynema.views.components.QuestionsComposable

/**
 * Función composable que representa la pantalla de las preguntas.
 *
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param currentUserViewModel El ViewModel responsable de gestionar la lógica del usuario.
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
 */
@Composable
fun QuestionView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel,
    quizVM: QuizViewModel
) {

    val quizId: String by quizVM.quizId.observeAsState(initial = "")

    LaunchedEffect(Unit){
        quizVM.getQuizById(quizId)
    }

    val stateFlow by quizVM.stateFlow.collectAsState()

    when (stateFlow) {
        is QuizState.Loading -> androidx.compose.material3.Text(text = "Loading...")
        is QuizState.Success -> {
            val quiz = (stateFlow as QuizState.Success).quiz

            val questions = listOf(
                quiz.question1,
                quiz.question2,
                quiz.question3,
                quiz.question4,
                quiz.question5
            )

            // Guarda una lista de las respuestas actuales
            var answerList: MutableList<String> = mutableListOf()

            // Guarda el título de la pregunta actual
            var questionTitle by rememberSaveable { mutableStateOf("") }

            // Indice para pasar a la siguiente pregunta
            var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }

            // Contador para contar las respuestas correctas
            var correctCount by rememberSaveable { mutableIntStateOf(0) }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(BackGroundApp)
            ) {
                if (currentQuestionIndex < questions.size) {

                    questions[currentQuestionIndex]?.forEachIndexed { index, option ->

                        when (index) {
                            0 -> questionTitle = option// Esto muestra la pregunta
                            else -> answerList.add(option) // Esto muestra las opciones
                        }

                    }

                    NavegacionSalir(
                        modifier = Modifier
                            .size(400.dp, 80.dp)
                            .align(Alignment.Start),
                        textQuestionNumber = "${currentQuestionIndex + 1}/5",
                        onExit = { navController.navigate(Routes.HomeScreen.route) }
                    )
                    QuestionsComposable(
                        modifier = Modifier.size(400.dp, 800.dp),
                        quizImg = painterResource(imageQuestionsResources[currentQuestionIndex]),
                        quizTitle = questionTitle,
                        answerText1 = answerList[0],
                        answerText2 = answerList[1],
                        answerText3 = answerList[2],
                        answerText4 = answerList[3],
                        onAnswerButton1 = {
                            val selectedAnswer = answerList[0]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                correctCount++
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton2 = {
                            val selectedAnswer = answerList[1]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                correctCount++
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton3 = {
                            val selectedAnswer = answerList[2]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                correctCount++
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton4 = {
                            val selectedAnswer = answerList[3]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                correctCount++
                            }
                            currentQuestionIndex++
                        }
                    )
                } else {
                    Congratulations(
                        greatJobText = "¡Buen trabajo! has conseguido $correctCount de 5 " +
                                "respuestas correctas",
                        onContinueButton = {
                            navController.navigate(Routes.HomeScreen.route)

                        }
                    )
                }
            }

        }

        is QuizState.Error -> androidx.compose.material3.Text(
            text = (stateFlow as QuizState.Error).message,
            color = Color.Red
        )
    }


}
/*

Intento para actualizar la nota al salir con el boton salir

// Para acceder a la id de la quiz
val idQuizActual = quiz.idQuiz

// Para acceder al total de completados de la quiz
var totalCompletedActual = quiz.totalCompleted

totalCompletedActual++

quizVM.updateQuizCompleted(idQuizActual, totalCompletedActual){
    navController.navigate(Routes.HomeScreen.route)
}

 */

