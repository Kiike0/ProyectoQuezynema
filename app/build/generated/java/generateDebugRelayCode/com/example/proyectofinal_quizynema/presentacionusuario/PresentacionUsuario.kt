package com.example.proyectofinal_quizynema.presentacionusuario

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

/**
 * This composable was generated from the UI Package 'presentacion_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun PresentacionUsuario(
    modifier: Modifier = Modifier,
    avatarImg: Painter = EmptyPainter(),
    nickname: String = "",
    levelText: String = ""
) {
    TopLevel(modifier = modifier) {
        AvatarImg(
            avatarImg = avatarImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -50.0.dp
                )
            )
        )
        Nickname(
            nickname = nickname,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 63.5.dp
                )
            )
        )
        LevelRectangle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 107.5.dp
                )
            )
        )
        LevelText(
            levelText = levelText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 106.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 197, heightDp = 248)
@Composable
private fun PresentacionUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            PresentacionUsuario(
                avatarImg = painterResource(R.drawable.presentacion_usuario_avatar_img),
                nickname = "Joker1231",
                levelText = "Jugador Profesional",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun AvatarImg(
    avatarImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = avatarImg,
        radius = 70.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(143.0.dp).requiredHeight(148.0.dp)
    )
}

@Composable
fun Nickname(
    nickname: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nickname,
        fontSize = 24.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LevelRectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.presentacion_usuario_level_rectangle),
        modifier = modifier.requiredWidth(197.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun LevelText(
    levelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = levelText,
        fontSize = 15.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
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
