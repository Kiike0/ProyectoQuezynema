package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.inicioquiz.InicioQuiz
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.model.states.QuizState
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedNavigationWithText

/**
 * Función composable que representa la pantalla del título de la quiz.
 *
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 *
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
 */
@Composable
fun QuizView(
    navController: NavHostController,
    //currentUserViewModel: UserViewModel,
    quizVM: QuizViewModel
) {

    val quizId: String by quizVM.quizId.observeAsState(initial = "")


    LaunchedEffect(Unit){
        quizVM.getQuizById(quizId)
    }

    val stateFlow by quizVM.stateFlow.collectAsState()


    when (stateFlow) {
        is QuizState.Loading -> Text(text = "Loading...")
        is QuizState.Success -> {
            val quiz = (stateFlow as QuizState.Success).quiz
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(BackGroundApp)
            ) {
                // Navegación con el titulo de la pantalla para poder volver atrás
                CustomizedNavigationWithText(
                    modifier = Modifier
                        .size(300.dp, 120.dp)
                        .align(Alignment.Start),
                    textNav = "Quiz",
                    onBack = { navController.navigate(Routes.HomeScreen.route) }
                )
                InicioQuiz(
                    modifier = Modifier.size(400.dp, 500.dp),
                    startText = "Iniciar",
                    quizTitleText = quiz.title,
                    quizDesc = "Responde a las preguntas y disfruta de la Quiz creada por los usuarios",
                    onStartButton = { navController.navigate(Routes.QuestionsScreen.route) }
                )
            }
        }

        is QuizState.Error -> Text(text = (stateFlow as QuizState.Error).message, color = Color.Red)
    }


}