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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navegacionsalir.NavegacionSalir
import com.example.proyectofinal_quizynema.preguntaquiz.PreguntaQuiz
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.model.states.QuizState
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

@Composable
fun QuestionView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel,
    quizVM: QuizViewModel,
    documentId: String
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
            var answerList: MutableList<String> = mutableListOf()

            var questionTitle by rememberSaveable { mutableStateOf("") }

            var currentQuestionIndex by rememberSaveable { mutableStateOf(0) }


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
                    PreguntaQuiz(
                        modifier = Modifier.size(400.dp, 800.dp),
                        quizImg = painterResource(R.drawable.pregunta_quiz_quiz_img),
                        quizTitle = "$questionTitle",
                        answerText1 = "${answerList[0]}",
                        answerText2 = "${answerList[1]}",
                        answerText3 = "${answerList[2]}",
                        answerText4 = "${answerList[3]}",
                        onAnswerButton1 = {
                            val selectedAnswer = answerList[0]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                // Incrementar el puntaje del usuario u otra lógica
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton2 = {
                            val selectedAnswer = answerList[1]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                // Incrementar el puntaje del usuario u otra lógica
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton3 = {
                            val selectedAnswer = answerList[2]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                // Incrementar el puntaje del usuario u otra lógica
                            }
                            currentQuestionIndex++
                        },
                        onAnswerButton4 = {
                            val selectedAnswer = answerList[3]
                            val correctAnswer = answerList[4]
                            if (selectedAnswer == correctAnswer) {
                                // Incrementar el puntaje del usuario u otra lógica
                            }
                            currentQuestionIndex++
                        }
                    )
                } else {
                    // Se ha completado el cuestionario, puedes mostrar un mensaje o realizar otra acción
                    // Por ejemplo:
                    Text(text = "¡Cuestionario completado!")
                }
            }
        }

        is QuizState.Error -> androidx.compose.material3.Text(
            text = (stateFlow as QuizState.Error).message,
            color = Color.Red
        )
    }


}

