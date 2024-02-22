package com.example.proyectofinal_quizynema.views.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.UserRegisterMod

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun Register(
    navController: NavHostController,
    registerViewModel: UserViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        Navegacion(
            modifier = Modifier
                .size(300.dp, 60.dp)
                .align(Alignment.Start),
            textNav = "Registro",
            onBack = { navController.navigate(Routes.AccessScreen.route) }
        )
        UserRegisterMod(
            modifier = Modifier.size(400.dp, 700.dp),
            registUserViewModel = registerViewModel,
            onbuttonCreateAcc = {},
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
            avatar12 = {}
        )

    }
}