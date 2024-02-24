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
    nicknameText: String = "",
    levelText: String = "",
    imgQuizyAvatar: Painter = EmptyPainter()
) {
    TopLevel(modifier = modifier) {
        Nickname(
            nicknameText = nicknameText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = -48.0.dp
                )
            )
        )
        BoxLevel(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -5.5.dp,
                    y = 24.5.dp
                )
            )
        )
        LevelText(
            levelText = levelText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 23.0.dp
                )
            )
        )
        ImgQuizyAvatar(
            imgQuizyAvatar = imgQuizyAvatar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -124.5.dp,
                    y = -46.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 316, heightDp = 160)
@Composable
private fun PresentacionUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            PresentacionUsuario(
                nicknameText = "Joker1231",
                levelText = "Jugador Profesional",
                imgQuizyAvatar = painterResource(R.drawable.presentacion_usuario_img_quizy_avatar),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Nickname(
    nicknameText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nicknameText,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(180.0.dp)
    )
}

@Composable
fun BoxLevel(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.presentacion_usuario_box_level),
        modifier = modifier.requiredWidth(295.0.dp).requiredHeight(33.0.dp)
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
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(266.0.dp)
    )
}

@Composable
fun ImgQuizyAvatar(
    imgQuizyAvatar: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imgQuizyAvatar,
        radius = 30.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(67.0.dp).requiredHeight(68.0.dp)
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
