package com.example.proyectofinal_quizynema.views.login

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.Alert
import com.example.proyectofinal_quizynema.views.components.LoginComposable

/**
 * Función composable que representa la pantalla principal para loguearse.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param accessViewModel El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun Login(
    navController: NavHostController,
    accessViewModel: UserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp),
        contentAlignment = Alignment.Center
    ) {
        LoginComposable(
            modifier = Modifier,
            onAccessButton = {
                accessViewModel.login {
                    // Agrega un registro para confirmar que onSuccess se está llamando correctamente
                    Log.d("LOGIN_SUCCESS", "Inicio de sesión exitoso")
                    navController.navigate(Routes.HomeScreen.route)
                }
            },
            onCreateButton = { navController.navigate(Routes.RegisterScreen.route) },
            accessUserViewModel = accessViewModel
        )
        if (accessViewModel.showAlert) {
            Alert(title = "Alerta",
                message = "Usuario y/o contrasena incorrectos",
                confirmText = "Aceptar",
                onConfirmClick = { accessViewModel.closeAlert() },
                onDismissClick = { } )
        }

    }
}