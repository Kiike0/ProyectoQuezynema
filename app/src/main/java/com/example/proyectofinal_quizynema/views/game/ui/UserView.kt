package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.botonesusuario.BotonesUsuario
import com.example.proyectofinal_quizynema.datosusuario.DatosUsuario
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.presentacionusuario.PresentacionUsuario
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

@Composable
fun UserView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {

    LaunchedEffect(Unit) {
        currentUserViewModel.getNickname()
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        Navegacion(
            modifier = Modifier
                .size(300.dp, 60.dp)
                .align(Alignment.Start),
            textNav = "Cuenta",
            onBack = { navController.navigate(Routes.HomeScreen.route) }
        )
        PresentacionUsuario(
            modifier = Modifier.size(300.dp, 250.dp),
            nicknameText = currentUserViewModel.getSaludo(),
            levelText = "Jugador nivel",
            imgQuizyAvatar = painterResource(R.drawable.presentacion_usuario_img_quizy_avatar)
        )
        DatosUsuario(
            modifier = Modifier.size(300.dp, 5.dp),
            pointsNumber = "12",
            pointsTxt = "Puntuación",
            jugadosNumber = "31",
            jugadosTxt = "Jugados",
            puestoNumber = "1",
            puestoRankingTxt = "Puesto Ranking"
        )
        BotonesUsuario(
            modifier = Modifier.size(300.dp, 250.dp),
            playMoreText = "Juega una vez más",
            signOutText = "Cerrar sesión",
            onPlayAgainIcon = {},
            onSignOutIcon = {
                currentUserViewModel.signOut()
                navController.navigate(Routes.StartGameScreen.route)
            }
        )

    }


}