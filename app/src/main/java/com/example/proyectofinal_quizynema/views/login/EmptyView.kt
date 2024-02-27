package com.example.proyectofinal_quizynema.views.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.model.QuizModel
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel
import com.google.firebase.auth.FirebaseAuth

/**
 * Vista composable que sirve como punto de entrada o pantalla inicial,
 * redirigiendo al usuario a la pantalla de inicio de sesión o al home según si hay una sesión iniciada.
 */
@Composable
fun EmptyView(
    navController: NavController,
    quizVM: QuizViewModel
){

    LaunchedEffect(Unit){
        if (!FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()){
            navController.navigate(Routes.HomeScreen.route)
        }else{
            navController.navigate(Routes.StartGameScreen.route)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.backgroundinicio),
            contentDescription = "Fondo de inicio",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

    }

}