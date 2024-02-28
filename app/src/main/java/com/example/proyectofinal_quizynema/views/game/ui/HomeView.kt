package com.example.proyectofinal_quizynema.views.game.ui

import android.content.ContentValues.TAG
import android.util.Log
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.painters.imageQuizResources
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedBigTextWhite
import com.example.proyectofinal_quizynema.views.components.CustomizedWelcomeMessage
import com.example.proyectofinal_quizynema.views.components.NavigationBar
import com.example.proyectofinal_quizynema.views.components.PopularQuiz
import com.example.proyectofinal_quizynema.views.components.QuizCardComposable
import com.example.proyectofinal_quizynema.views.components.RandomQuiz


@Composable
fun HomeView(
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
    val titulosArrayList = ArrayList<String>()
    val totalCompletedArrayList = ArrayList<Int>()

    datos.forEach { item ->
        titulosArrayList.add(item.title)
        totalCompletedArrayList.add(item.totalCompleted)
    }

    val tamanyo = datos.size

    val listaTitulosJSON = titulosArrayList.toString()

    // Elimina los corchetes "[" y "]" del principio y final de la cadena
    val jsonSinCorchetes = listaTitulosJSON.substring(1, listaTitulosJSON.length - 1)
    // Divide la cadena por las comas para obtener los valores individuales
    val valores = jsonSinCorchetes.split(", ")
    // Accede al primer valor de la lista
    val primerValor = valores[0]
    // IMPORTANTE: Usamos getOrNull para evitar excepciones si el índice está fuera de los límites
    // Si no hacemos esto se rompe el programa
    val segundoValor = valores.getOrNull(1)

    val listaCompletadosJSON = totalCompletedArrayList.toString()
    Log.d(TAG, listaCompletadosJSON)


    val jsonCompletadosSinCorchetes =
        listaCompletadosJSON.substring(1, listaCompletadosJSON.length - 1)
    val valoresCompletados = jsonCompletadosSinCorchetes.split(", ")
    val primerValorCompletado = valoresCompletados[0]
    val segundoValorCompletado = valoresCompletados.getOrNull(1)
    Log.d(TAG, "${valoresCompletados.getOrNull(1)}")



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        CustomizedWelcomeMessage(
            modifier = Modifier,
            greetings = "Buenos días, ${currentUserViewModel.getSaludo()}!",
            letsQuizText = "Hagamos una quiz hoy",
            onQuizyAvatarImg = {
                //navController.navigate(Routes.UserScreen.route)
            }
        )

        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, top = 95.dp)
        ) {
            Spacer(modifier = Modifier.height(15.dp))
            RandomQuiz(
                modifier = Modifier,
                img = painterResource(id = R.drawable.palomitas),
                onComenzarButton = {

                    val randomIndex = (0 until tamanyo).random()

                    quizVM.changeQuizId(quizIdsList[randomIndex])
                    navController.navigate(Routes.QuizScreen.route)
                }
            )
            Spacer(modifier = Modifier.height(15.dp))
            CustomizedBigTextWhite(customizedText = "Quiz Populares", Modifier)
            Spacer(modifier = Modifier.height(15.dp))

            LazyRow {
                item {
                    PopularQuiz(
                        times = "${valoresCompletados.getOrNull(5)} visitas",
                        quizTitle = "${valores.getOrNull(5)}",
                        onQuizButton = {
                            quizVM.changeQuizId(quizIdsList[5])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
                item {
                    PopularQuiz(
                        times = "${valoresCompletados.getOrNull(0)} visitas",
                        quizTitle = "${valores.getOrNull(0)}",
                        onQuizButton = {
                            quizVM.changeQuizId(quizIdsList[0])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
                item {
                    PopularQuiz(
                        times = "${valoresCompletados.getOrNull(1)} visitas",
                        quizTitle = "${valores.getOrNull(1)}",
                        onQuizButton = {
                            quizVM.changeQuizId(quizIdsList[1])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
                item {
                    PopularQuiz(
                        times = "${valoresCompletados.getOrNull(4)} visitas",
                        quizTitle = "${valores.getOrNull(4)}",
                        onQuizButton = {
                            quizVM.changeQuizId(quizIdsList[4])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }

            Spacer(modifier = Modifier.height(15.dp))
            Row() {
                CustomizedBigTextWhite(customizedText = "Quiz disponibles", Modifier)

                /* Botón que hice que no utilicé después, no lo quiero eliminar por si acaso
                Spacer(modifier = Modifier.width(185.dp))
                Button(
                    onClick = { navController.navigate(Routes.AllQuizzesScreen.route) },
                    Modifier
                        .padding(end = 15.dp)
                        .size(90.dp, 20.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                ) {
                    CustomizedTextWhiteSmaller(
                        customizedText = "Ver todas",
                        Modifier
                    )
                }

                 */
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                QuizCardComposable(
                    modifier = Modifier
                        .size(155.dp, 200.dp),
                    quizImg = painterResource(imageQuizResources[0]),
                    quizTitleText = primerValor,
                    onBoxQuiz = {
                        quizVM.changeQuizId(quizIdsList[0])
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
                    quizImg = painterResource(imageQuizResources[1]),
                    quizTitleText = "$segundoValor",
                    onBoxQuiz = {
                        quizVM.changeQuizId(quizIdsList[1])
                        navController.navigate(Routes.QuizScreen.route)
                    },
                    onQuizImg = {
                        quizVM.changeQuizId(quizIdsList[1])
                        navController.navigate(Routes.QuizScreen.route)

                    }
                )

            }


        }

        // Se que es muy raro este método pero al ser de Relay.. si no lo hacemos así no se pone al fondo
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(color = Color.Transparent)
                    .align(Alignment.BottomCenter)
            ) {
                NavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    onCerrarSesion = {
                        currentUserViewModel.signOut()
                        navController.navigate(Routes.StartGameScreen.route)
                    },
                    onAgregar = { navController.navigate(Routes.AddQuizScreen.route) },
                    onHome = {},
                    onVerQuizzes = { navController.navigate(Routes.AllQuizzesScreen.route) }
                )

            }
        }


    }
}

