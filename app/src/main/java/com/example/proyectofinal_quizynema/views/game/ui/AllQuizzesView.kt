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
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.painters.imageQuizResources
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedTextScreen
import com.example.proyectofinal_quizynema.views.components.NavigationBar
import com.example.proyectofinal_quizynema.views.components.QuizCardComposable

/**
 * Función composable que representa la pantalla para ver todas las quiz disponibles.
 *
 * NOTA IMPORTANTE: Si no se ve tu quiz agregada, agrega otra, porque el tamaño de la coleccion de
 * quiz debe ser par para que se vea en Quiz disponibles, una vez sea par, ya se verán ambas creadas.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param currentUserViewModel El ViewModel responsable de gestionar la lógica del usuario.
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
 */
@Composable
fun AllQuizzesView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel,
    quizVM: QuizViewModel
) {

    val quizIdsList: ArrayList<String> by quizVM.quizIdsList.observeAsState(ArrayList())


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
    val valoresTitulos = jsonSinCorchetes.split(", ")

    // Accede al primer valor de la lista
    //val primerValor = valoresTitulos[0]
    // IMPORTANTE: Usamos getOrNull para evitar excepciones si el índice está fuera de los límites
    // Si no hacemos esto se rompe el programa
    //val segundoValor = valoresTitulos.getOrNull(0)


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        CustomizedTextScreen(
            textNav = "Quiz Disponibles",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Comprobación si el tamaño de la lista es impar
        // var esImpar = false
        // if(datos.size % 2 != 0) esImpar = true

        //Ya que son 2 elementos por item de LazyColumn hay que dividirlo entre dos
        val tamanyo = datos.size / 2
        val tamanyoImagenResources = imageQuizResources.size / 2

        // Para no sobrepasar el tamaño de las imagenes
        var elementoComprobacion = 0

        LazyColumn {
            items(tamanyo) { elemento ->

                if(elemento < tamanyo) elementoComprobacion = elemento else elementoComprobacion = 0

                Row() {
                    QuizCardComposable(
                        modifier = Modifier
                            .size(155.dp, 200.dp),
                        quizImg = painterResource(imageQuizResources[elemento]),
                        quizTitleText = "${valoresTitulos.getOrNull(elemento)}",
                        onBoxQuiz = {
                            quizVM.changeQuizId(quizIdsList[elemento])
                            navController.navigate(Routes.QuizScreen.route)
                        },
                        onQuizImg = {
                            quizVM.changeQuizId(quizIdsList[elemento])
                            navController.navigate(Routes.QuizScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.width(25.dp))
                    QuizCardComposable(
                        modifier = Modifier.size(155.dp, 200.dp),
                        quizImg = painterResource(imageQuizResources[elementoComprobacion + tamanyoImagenResources]),
                        quizTitleText = "${valoresTitulos.getOrNull(elemento+tamanyo)}",
                        onBoxQuiz = {
                            quizVM.changeQuizId(quizIdsList[(elemento+tamanyo)])
                            navController.navigate(Routes.QuizScreen.route) },
                        onQuizImg = {
                            quizVM.changeQuizId(quizIdsList[(elemento+tamanyo)])
                            navController.navigate(Routes.QuizScreen.route)

                        }
                    )
                }
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
                    onHome = { navController.navigate(Routes.HomeScreen.route) },
                    onVerQuizzes = {}
                )

            }
        }


    }
}