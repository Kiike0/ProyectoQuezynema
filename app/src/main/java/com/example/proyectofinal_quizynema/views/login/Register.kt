package com.example.proyectofinal_quizynema.views.login


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.RegisterComposable

/**
 * Función composable que representa la pantalla principal para registrarse.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param newUserVM El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun Register(
    navController: NavHostController,
    newUserVM: UserViewModel
) {
        RegisterComposable(
            newUserVM = newUserVM,
            navController = navController
        )
}