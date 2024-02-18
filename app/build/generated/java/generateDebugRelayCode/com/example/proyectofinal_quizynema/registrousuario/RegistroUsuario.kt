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
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
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
    favoriteMovie: String = "",
    chooseAvatar: String = "",
    repeatPassword: String = "",
    password: String = "",
    nickname: String = "",
    onbuttonCreateAcc: () -> Unit = {},
    onAlterFavMovie: () -> Unit = {},
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
    avatar12: () -> Unit = {},
    onAlterRepeatPassword: () -> Unit = {},
    onAlterPassword: () -> Unit = {},
    onAlterNickname: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        RectanglebuttonCreateAcc(
            onbuttonCreateAcc = onbuttonCreateAcc,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -3.5.dp,
                    y = 311.5.dp
                )
            )
        )
        CreateAccount(
            createAccount = createAccount,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 311.5.dp
                )
            )
        )
        AlterFavMovie(
            onAlterFavMovie = onAlterFavMovie,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.0.dp,
                    y = 207.5.dp
                )
            )
        )
        FavoriteMovie(
            favoriteMovie = favoriteMovie,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -125.0.dp,
                    y = 197.5.dp
                )
            )
        )
        Avatar1(
            avatar1 = avatar1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -128.5.dp,
                    y = -73.5.dp
                )
            )
        )
        Avatar2(
            avatar2 = avatar2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -40.5.dp,
                    y = -73.5.dp
                )
            )
        )
        Avatar3(
            avatar3 = avatar3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 47.5.dp,
                    y = -73.5.dp
                )
            )
        )
        Avatar4(
            avatar4 = avatar4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 135.5.dp,
                    y = -73.5.dp
                )
            )
        )
        Avatar5(
            avatar5 = avatar5,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -128.5.dp,
                    y = 18.5.dp
                )
            )
        )
        Avatar6(
            avatar6 = avatar6,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -40.5.dp,
                    y = 18.5.dp
                )
            )
        )
        Avatar7(
            avatar7 = avatar7,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 47.5.dp,
                    y = 18.5.dp
                )
            )
        )
        Avatar8(
            avatar8 = avatar8,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 135.5.dp,
                    y = 18.5.dp
                )
            )
        )
        Avatar9(
            avatar9 = avatar9,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -128.5.dp,
                    y = 110.5.dp
                )
            )
        )
        Avatar10(
            avatar10 = avatar10,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -40.5.dp,
                    y = 110.5.dp
                )
            )
        )
        Avatar11(
            avatar11 = avatar11,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 47.5.dp,
                    y = 110.5.dp
                )
            )
        )
        Avatar12(
            avatar12 = avatar12,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 135.5.dp,
                    y = 110.5.dp
                )
            )
        )
        ChooseAvatar(
            chooseAvatar = chooseAvatar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -128.5.dp,
                    y = -143.5.dp
                )
            )
        )
        AlterRepeatPassword(
            onAlterRepeatPassword = onAlterRepeatPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.0.dp,
                    y = -195.5.dp
                )
            )
        )
        RepeatPassword(
            repeatPassword = repeatPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -117.0.dp,
                    y = -205.5.dp
                )
            )
        )
        AlterPassword(
            onAlterPassword = onAlterPassword,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.0.dp,
                    y = -257.5.dp
                )
            )
        )
        Password(
            password = password,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -134.5.dp,
                    y = -267.5.dp
                )
            )
        )
        AlterNickname(
            onAlterNickname = onAlterNickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.0.dp,
                    y = -319.5.dp
                )
            )
        )
        Nickname(
            nickname = nickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.5.dp,
                    y = -331.5.dp
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
                onAlterFavMovie = {},
                favoriteMovie = "Película favorita",
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
                avatar12 = {},
                chooseAvatar = "Elige tu avatar",
                onAlterRepeatPassword = {},
                repeatPassword = "Repetir contraseña",
                onAlterPassword = {},
                password = "Contraseña",
                onAlterNickname = {},
                nickname = "Nombre de usuario",
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
fun AlterFavMovie(
    onAlterFavMovie: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_fav_movie),
        modifier = modifier.tappable(onTap = onAlterFavMovie).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun FavoriteMovie(
    favoriteMovie: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = favoriteMovie,
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
fun Avatar1(
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
        modifier = modifier.tappable(onTap = avatar1).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar2(
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
        modifier = modifier.tappable(onTap = avatar2).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar3(
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
        modifier = modifier.tappable(onTap = avatar3).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar4(
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
        modifier = modifier.tappable(onTap = avatar4).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar5(
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
        modifier = modifier.tappable(onTap = avatar5).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar6(
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
        modifier = modifier.tappable(onTap = avatar6).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar7(
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
        modifier = modifier.tappable(onTap = avatar7).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar8(
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
        modifier = modifier.tappable(onTap = avatar8).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar9(
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
        modifier = modifier.tappable(onTap = avatar9).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar10(
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
        modifier = modifier.tappable(onTap = avatar10).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar11(
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
        modifier = modifier.tappable(onTap = avatar11).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Avatar12(
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
        modifier = modifier.tappable(onTap = avatar12).requiredWidth(72.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun ChooseAvatar(
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
        modifier = modifier.tappable(onTap = onAlterRepeatPassword).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
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
        modifier = modifier
    )
}

@Composable
fun AlterPassword(
    onAlterPassword: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_password),
        modifier = modifier.tappable(onTap = onAlterPassword).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
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
        modifier = modifier
    )
}

@Composable
fun AlterNickname(
    onAlterNickname: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.registro_usuario_alter_nickname),
        modifier = modifier.tappable(onTap = onAlterNickname).requiredWidth(335.0.dp).requiredHeight(42.0.dp)
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
        modifier = modifier
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
