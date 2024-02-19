package com.example.proyectofinal_quizynema.views.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.views.components.AccesoUsuarioMod
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 */
@Composable
fun InicioSesion(
    navController: NavHostController,
    accessViewModel: UserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp),
        contentAlignment = Alignment.Center
    ) {
        AccesoUsuarioMod(
            modifier = Modifier,
            onAccessButton = { accessViewModel.login {  }},
            createAccountTap = { navController.navigate(Routes.RegisterScreen.route) },
            remindPasswordTap = {},
            accessUserViewModel = UserViewModel()
        )

    }
}