package com.example.proyectofinal_quizynema.views.game.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
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
import com.example.proyectofinal_quizynema.quizsinterminar.QuizSinTerminar
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.views.components.CustomizedRelayText

@Composable
fun UserView(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {

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
            avatarImg = painterResource(R.drawable.presentacion_usuario_avatar_img),
            nickname = "Nickname",
            levelText = "Jugador nivel"
        )
        DatosUsuario(
            modifier = Modifier.size(300.dp, 140.dp),
            pointsNumber = "12",
            pointsTxt = "Puntuación",
            jugadosNumber = "31",
            jugadosTxt = "Jugados",
            puestoNumber = "1",
            puestoRankingTxt = "Puesto Ranking"
        )
        BotonesUsuario(
            modifier = Modifier.size(300.dp, 50.dp),
            editarPerfilText = "Editar Perfil",
            verRankingText = "Ver Ranking",
            onEditarPerfilButton = {},
            onRankingButton = {}
        )
        CustomizedRelayText(
            greetings = "Últimas quiz",
            Modifier
                .align(Alignment.Start)
                .padding(top = 20.dp, start = 30.dp)
        )
        QuizSinTerminar(
            modifier = Modifier.size(300.dp, 110.dp),
            pointstext = "5/10",
            iniciadaText = "Iniciada sin terminar",
            titleUnfinishedQuiz = "Título de la quiz",
            onImageButtonUQ = {},
            onRectangleButtonUQ = {}
        )
        QuizSinTerminar(
            modifier = Modifier.size(300.dp, 70.dp),
            pointstext = "5/10",
            iniciadaText = "Iniciada sin terminar",
            titleUnfinishedQuiz = "Título de la quiz",
            onImageButtonUQ = {},
            onRectangleButtonUQ = {}
        )
    }


}