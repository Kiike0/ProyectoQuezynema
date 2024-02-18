package com.example.proyectofinal_quizynema.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.botonjugar.BotonJugar
import com.example.proyectofinal_quizynema.welcomecomponent.WelcomeComponent
import com.example.proyectofinal_quizynema.welcometext.WelcomeText
import com.google.relay.compose.BoxScopeInstanceImpl.align

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun PantallaInicial(
    //navController: NavHostController //,
    //viewModel: MenuInicioViewModel
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
            onButtonPlayNow = {}
        )


    }
}