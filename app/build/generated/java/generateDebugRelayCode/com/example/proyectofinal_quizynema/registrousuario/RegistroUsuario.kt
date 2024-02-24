package com.example.proyectofinal_quizynema.registrousuario

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'registro_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun RegistroUsuario(
    modifier: Modifier = Modifier,
    createAccount: String = "",
    repeatPassword: String = "",
    password: String = "",
    nickname: String = "",
    onbuttonCreateAcc: () -> Unit = {},
    onAlterRepeatPassword: () -> Unit = {},
    onAlterPassword: () -> Unit = {},
    onAlterNickname: () -> Unit = {},
    onAlterEmailText: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        RectanglebuttonCreateAcc(
            onbuttonCreateAcc = onbuttonCreateAcc,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 29.5.dp
                )
            )
        )
        CreateAccount(
            createAccount = createAccount,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 3.0.dp,
                    y = 29.5.dp
                )
            )
        )
        AlterRepeatPassword(
            onAlterRepeatPassword = onAlterRepeatPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -44.0.dp
                )
            )
        )
        RepeatPassword(
            repeatPassword = repeatPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.0.dp,
                    y = -57.0.dp
                )
            )
        )
        AlterPassword(
            onAlterPassword = onAlterPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -100.0.dp
                )
            )
        )
        Password(
            password = password,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -133.5.dp,
                    y = -112.5.dp
                )
            )
        )
        AlterNickname(
            onAlterNickname = onAlterNickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -155.0.dp
                )
            )
        )
        Nickname(
            nickname = nickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -115.5.dp,
                    y = -169.5.dp
                )
            )
        )
        AlterEmailText(
            onAlterNickname = onAlterNickname,
            onAlterEmailText = onAlterEmailText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -210.0.dp
                )
            )
        )
        Email(
            nickname = nickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -114.5.dp,
                    y = -224.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 343, heightDp = 681)
@Composable
private fun RegistroUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            RegistroUsuario(
                onbuttonCreateAcc = {},
                createAccount = "Crear cuenta",
                onAlterRepeatPassword = {},
                repeatPassword = "Repetir contraseña",
                onAlterPassword = {},
                password = "Contraseña",
                onAlterNickname = {},
                nickname = "Email",
                onAlterEmailText = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RectanglebuttonCreateAcc(
    onbuttonCreateAcc: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_rectanglebutton_create_acc),
        modifier = modifier.tappable(onTap = onbuttonCreateAcc).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun CreateAccount(
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
fun AlterRepeatPassword(
    onAlterRepeatPassword: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_repeat_password),
        modifier = modifier.tappable(onTap = onAlterRepeatPassword).requiredWidth(344.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun RepeatPassword(
    repeatPassword: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = repeatPassword,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(91.0.dp).requiredHeight(11.0.dp)
    )
}

@Composable
fun AlterPassword(
    onAlterPassword: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_password),
        modifier = modifier.tappable(onTap = onAlterPassword).requiredWidth(344.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Password(
    password: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = password,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(56.0.dp).requiredHeight(10.0.dp)
    )
}

@Composable
fun AlterNickname(
    onAlterNickname: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_nickname),
        modifier = modifier.tappable(onTap = onAlterNickname).requiredWidth(344.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Nickname(
    nickname: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nickname,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(92.0.dp).requiredHeight(10.0.dp)
    )
}

@Composable
fun AlterEmailText(
    onAlterNickname: () -> Unit,
    onAlterEmailText: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_email_text),
        modifier = modifier.tappable(
            onTap = onAlterNickname,
            onDoubleTap = onAlterEmailText
        ).requiredWidth(344.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Email(
    nickname: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nickname,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(92.0.dp).requiredHeight(10.0.dp)
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
