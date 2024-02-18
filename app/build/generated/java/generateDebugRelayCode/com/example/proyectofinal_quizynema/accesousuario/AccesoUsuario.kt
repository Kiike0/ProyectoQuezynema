package com.example.proyectofinal_quizynema.accesousuario

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'acceso_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun AccesoUsuario(
    modifier: Modifier = Modifier,
    accessText: String = "",
    textDescription: String = "",
    passwordText: String = "",
    nicknameText: String = "",
    rectangleImg: Painter = EmptyPainter(),
    onAccessButton: () -> Unit = {},
    createAccountTap: () -> Unit = {},
    remindPasswordTap: () -> Unit = {},
    onAlterTextPassword: () -> Unit = {},
    onAlterText: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        AccessButtonRectangle(
            onAccessButton = onAccessButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.5.dp,
                    y = 220.5.dp
                )
            )
        )
        AccessText(
            accessText = accessText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.0.dp,
                    y = 220.5.dp
                )
            )
        )
        CreateAccountTap(
            createAccountTap = createAccountTap,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 89.5.dp,
                    y = 149.5.dp
                )
            )
        )
        RectangleSeparation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 5.5.dp,
                    y = 150.0.dp
                )
            )
        )
        RemindPasswordTap(
            remindPasswordTap = remindPasswordTap,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -65.0.dp,
                    y = 149.5.dp
                )
            )
        )
        TextDescription(
            textDescription = textDescription,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 88.5.dp
                )
            )
        )
        AlterTextPassword(
            onAlterTextPassword = onAlterTextPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 26.5.dp
                )
            )
        )
        Password(
            passwordText = passwordText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -130.5.dp,
                    y = 16.5.dp
                )
            )
        )
        AlterText(
            onAlterText = onAlterText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -44.5.dp
                )
            )
        )
        Nickname(
            nicknameText = nicknameText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -112.5.dp,
                    y = -56.5.dp
                )
            )
        )
        RectangleImg(
            rectangleImg = rectangleImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 3.5.dp,
                    y = -173.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 335, heightDp = 499)
@Composable
private fun AccesoUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            AccesoUsuario(
                onAccessButton = {},
                accessText = "Acceder",
                createAccountTap = {},
                remindPasswordTap = {},
                textDescription = "Si no tienes cuenta debes crear una para acceder",
                onAlterTextPassword = {},
                passwordText = "Contraseña",
                onAlterText = {},
                nicknameText = "Nombre de usuario",
                rectangleImg = painterResource(R.drawable.acceso_usuario_rectangle_img),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun AccessButtonRectangle(
    onAccessButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_access_button_rectangle),
        modifier = modifier.tappable(onTap = onAccessButton).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun AccessText(
    accessText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = accessText,
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
fun CreateAccountTap(
    createAccountTap: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Crear una cuenta",
        fontSize = 13.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.200000029343825.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.tappable(onTap = createAccountTap).requiredWidth(124.0.dp)
    )
}

@Composable
fun RectangleSeparation(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_rectangle_separation),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun RemindPasswordTap(
    remindPasswordTap: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Recordar contraseña",
        fontSize = 13.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.200000029343825.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.tappable(onTap = remindPasswordTap).requiredWidth(165.0.dp)
    )
}

@Composable
fun TextDescription(
    textDescription: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textDescription,
        fontSize = 15.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 151,
            green = 168,
            blue = 183
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(300.0.dp)
    )
}

@Composable
fun AlterTextPassword(
    onAlterTextPassword: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_alter_text_password),
        modifier = modifier.tappable(onTap = onAlterTextPassword).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Password(
    passwordText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = passwordText,
        fontSize = 10.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 151,
            green = 168,
            blue = 183
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun AlterText(
    onAlterText: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_alter_text),
        modifier = modifier.tappable(onTap = onAlterText).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Nickname(
    nicknameText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nicknameText,
        fontSize = 10.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 151,
            green = 168,
            blue = 183
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun RectangleImg(
    rectangleImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = rectangleImg,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(270.0.dp).requiredHeight(153.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
