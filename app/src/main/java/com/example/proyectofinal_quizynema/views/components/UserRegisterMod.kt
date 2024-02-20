package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.registrousuario.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserRegisterMod(
    modifier: Modifier = Modifier,
    registUserViewModel: UserViewModel,
    onbuttonCreateAcc: () -> Unit = {},
    avatar1: () -> Unit = {},
    avatar2: () -> Unit = {},
    avatar3: () -> Unit = {},
    avatar4: () -> Unit = {},
    avatar5: () -> Unit = {},
    avatar6: () -> Unit = {},
    avatar7: () -> Unit = {},
    avatar8: () -> Unit = {},
    avatar9: () -> Unit = {},
    avatar10: () -> Unit = {},
    avatar11: () -> Unit = {},
    avatar12: () -> Unit = {}
) {
    TopLevelRMod(modifier = modifier) {

        // Texto editable para el Email
        OutlinedTextField(
            value = registUserViewModel.email,
            onValueChange = { registUserViewModel.changeEmail(it) },
            label = { CustomizedText(customizedText = "Email") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -5.0.dp,
                        y = -316.0.dp
                    )
                )
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )
        // Texto editable para el Nombre de usuario
        OutlinedTextField(
            value = registUserViewModel.nickname,
            onValueChange = { registUserViewModel.changeUserName(it) },
            label = { CustomizedText(customizedText = "Nombre de usuario") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -5.0.dp,
                        y = -247.dp
                    )
                )
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )
        // Texto editable para la Contraseña
        OutlinedTextField(
            value = registUserViewModel.password,
            onValueChange = { registUserViewModel.changePassword(it) },
            label = { CustomizedText(customizedText = "Contraseña") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -5.0.dp,
                        y = -177.dp
                    )
                )
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )
        // Texto editable para comprobar si la contraseña es la misma
        OutlinedTextField(
            value = registUserViewModel.password,
            onValueChange = { },
            label = { CustomizedText(customizedText = "Repite contraseña") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -5.0.dp,
                        y = -108.0.dp
                    )
                )
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )
        // Texto y ubicacion exacta en la pantalla de Elige tu avatar
        ChooseAvatarRMod(
            chooseAvatar = "Elige tu avatar",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -140.dp,
                    y = -66.dp
                )
            )
        )
        Avatar1RMod(
            avatar1 = avatar1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -136.5.dp,
                    y = -16.dp
                )
            )
        )
        Avatar2RMod(
            avatar2 = avatar2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -48.5.dp,
                    y = -16.dp
                )
            )
        )
        Avatar3RMod(
            avatar3 = avatar3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = -16.dp
                )
            )
        )
        Avatar4RMod(
            avatar4 = avatar4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 127.5.dp,
                    y = -16.dp
                )
            )
        )
        Avatar5RMod(
            avatar5 = avatar5,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -136.5.dp,
                    y = 76.dp
                )
            )
        )
        Avatar6RMod(
            avatar6 = avatar6,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -48.5.dp,
                    y = 76.dp
                )
            )
        )
        Avatar7RMod(
            avatar7 = avatar7,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = 76.dp
                )
            )
        )
        Avatar8RMod(
            avatar8 = avatar8,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 127.5.dp,
                    y = 76.dp
                )
            )
        )
        Avatar9RMod(
            avatar9 = avatar9,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -136.5.dp,
                    y = 168.dp
                )
            )
        )
        Avatar10RMod(
            avatar10 = avatar10,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -48.5.dp,
                    y = 168.dp
                )
            )
        )
        Avatar11RMod(
            avatar11 = avatar11,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = 168.dp
                )
            )
        )
        Avatar12RMod(
            avatar12 = avatar12,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 127.5.dp,
                    y = 168.dp
                )
            )
        )
        // Texto editable para la pelicula favorita
        OutlinedTextField(
            value = registUserViewModel.favoriteFilm,
            onValueChange = { registUserViewModel.changeFavoriteFilm(it) },
            label = { CustomizedText(customizedText = "Pelicula favorita") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -5.0.dp,
                        y = 242.0.dp
                    )
                )
                .background(BackGroundAccessBox)
                .width(350.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )

        RectanglebuttonCreateAccRMod(
            onbuttonCreateAcc = onbuttonCreateAcc,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.5.dp,
                    y = 315.dp
                )
            )
        )
        CreateAccountRMod(
            createAccount = "Crear cuenta",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 315.dp
                )
            )
        )
    }
}

@Composable
fun ChooseAvatarRMod(
    chooseAvatar: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = chooseAvatar,
        fontSize = 10.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(68.0.dp)
            .requiredHeight(11.0.dp)
    )
}

@Composable
fun Avatar1RMod(
    avatar1: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar1),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar1)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar2RMod(
    avatar2: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar2),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar2)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar3RMod(
    avatar3: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar3),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar3)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar4RMod(
    avatar4: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar4),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar4)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar5RMod(
    avatar5: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar5),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar5)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar6RMod(
    avatar6: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar6),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar6)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar7RMod(
    avatar7: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar7),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar7)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar8RMod(
    avatar8: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar8),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar8)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar9RMod(
    avatar9: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar9),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar9)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar10RMod(
    avatar10: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar10),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar10)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar11RMod(
    avatar11: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar11),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar11)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun Avatar12RMod(
    avatar12: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.registro_usuario_avatar12),
        radius = 40.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        strokeWidth = 1.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatar12)
            .requiredWidth(70.0.dp)
            .requiredHeight(70.0.dp)
    )
}

@Composable
fun RectanglebuttonCreateAccRMod(
    onbuttonCreateAcc: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_rectanglebutton_create_acc),
        modifier = modifier.tappable(onTap = onbuttonCreateAcc).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
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

@Composable
fun TopLevelRMod(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}