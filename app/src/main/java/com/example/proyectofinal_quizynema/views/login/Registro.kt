package com.example.proyectofinal_quizynema.views.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.registrousuario.RegistroUsuario
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun Registro(
    navController: NavHostController,
    registerViewModel: UserViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        Navegacion(
            modifier = Modifier.size(300.dp, 50.dp).align(Alignment.Start),
            textNav = "Registro",
            onBack = { navController.navigate(Routes.AccessScreen.route) }
        )
        RegistroUsuario(
            modifier = Modifier.size(415.dp, 685.dp),
            createAccount = "Crear Cuenta",
            favoriteMovie = "Pelicula favorita",
            chooseAvatar = "Elige tu Avatar",
            repeatPassword = "Repite Contraseña",
            password = "Contraseña",
            nickname = "Nombre de usuario",
            onbuttonCreateAcc = {},
            onAlterFavMovie = {},
            avatar1 = {},
            avatar2 = {},
            avatar3 = {},
            avatar4 = {},
            avatar5 = {},
            avatar6 = {},
            avatar7 = {},
            avatar8 = {},
            avatar9 = {},
            avatar10 = {},
            avatar11 = {},
            avatar12 = {},
            onAlterRepeatPassword = {},
            onAlterPassword = {},
            onAlterNickname = {}
        )
    }
}