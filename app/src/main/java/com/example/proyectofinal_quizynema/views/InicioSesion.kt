package com.example.proyectofinal_quizynema.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.accesousuario.AccesoUsuario
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun InicioSesion(
    //navController: NavHostController //,
    //viewModel: MenuInicioViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp),
        contentAlignment = Alignment.Center
    ) {
        AccesoUsuario(
            modifier = Modifier,
            accessText = "Acceder",
            textDescription = "Si no tienes cuenta debes crear una para acceder",
            passwordText = "Contraseña",
            nicknameText = "Nombre de usuario",
            rectangleImg = painterResource(id = R.drawable.quezynematitle),
            onAccessButton = {},
            createAccountTap = {},
            remindPasswordTap = {},
            onAlterTextPassword = {},
            onAlterText = {}
        )

    }
}