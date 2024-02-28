package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.registrousuario.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable


/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 * Representa a la composable para crear una nueva cuenta en la base de datos
 *
 *  @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 *  @param newUserVM El ViewModel responsable de gestionar la lógica del usuario.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterComposable(
    newUserVM: UserViewModel,
    navController: NavHostController
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {

        // Navegación con el titulo de la pantalla para poder volver atrás
        Navegacion(
            modifier = Modifier
                .size(300.dp, 120.dp)
                .align(Alignment.Start),
            textNav = "Registro",
            onBack = { navController.navigate(Routes.AccessScreen.route) }
        )

        // Texto editable para el Email
        OutlinedTextField(
            value = newUserVM.email,
            onValueChange = { newUserVM.changeEmail(it) },
            label = { CustomizedText(customizedText = "Email") },
            modifier = Modifier
                .padding(top = 70.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            textStyle = LocalTextStyle.current.copy(color = Color.White)
        )

        // Texto editable para el Nombre de usuario
        OutlinedTextField(
            value = newUserVM.nickName,
            onValueChange = { newUserVM.changeUserName(it) },
            label = { CustomizedText(customizedText = "Nombre de usuario") },
            modifier = Modifier
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            textStyle = LocalTextStyle.current.copy(color = Color.White)
        )

        // Texto editable para la Contraseña
        OutlinedTextField(
            value = newUserVM.password,
            onValueChange = { newUserVM.changePassword(it) },
            label = { CustomizedText(customizedText = "Contraseña") },
            modifier = Modifier
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            textStyle = LocalTextStyle.current.copy(color = Color.White)
        )

        // Ubicación y estilo del botón Crear cuenta
        RectanglebuttonCreateAccRMod(
            onbuttonCreateAcc =  { newUserVM.createUser { navController.navigate(Routes.HomeScreen.route) } },
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-4.5).dp,
                    y = 60.dp
                )
            )
        )

        // Texto que aparece en el botón "Crear cuenta"
        CreateAccountRMod(
            createAccount = "Crear cuenta",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-1.0).dp,
                    y = 20.dp
                )
            )
        )

        // Salta esta alerta si no se crea bien el usuario
        if (newUserVM.showAlert) {
            Alert(title = "Alerta",
                message = "Usuario no creado correctamente",
                confirmText = "Aceptar",
                onConfirmClick = { newUserVM.closeAlert() },
                onDismissClick = { })
        }
    }
}


@Composable
fun RectanglebuttonCreateAccRMod(
    onbuttonCreateAcc: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_rectanglebutton_create_acc),
        modifier = modifier
            .tappable(onTap = onbuttonCreateAcc)
            .requiredWidth(230.0.dp)
            .requiredHeight(58.0.dp)
    )
}

@Composable
fun CreateAccountRMod(
    createAccount: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = createAccount,
        fontSize = 20.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}