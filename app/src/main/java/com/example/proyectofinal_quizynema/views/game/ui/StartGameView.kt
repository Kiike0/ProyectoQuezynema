package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.welcomecomponent.WelcomeComponent

/**
 * Función composable que representa la pantalla principal del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun StartGameView(
    navController: NavHostController
) {
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

        WelcomeComponent(
            modifier = Modifier
                .size(415.dp, 250.dp)
                .align(Alignment.TopCenter)
                .padding(top = 200.dp),
            playNowTextButton = "Play Now",
            welcomeText = "Únete y juega para ampliar tu conocimiento cinéfilo",
            nameAppImg = painterResource(id = R.drawable.quezynematitle),
            onButtonPlayNow = { navController.navigate(Routes.AccessScreen.route) }
        )


    }
}