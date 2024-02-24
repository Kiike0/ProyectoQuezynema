package com.example.proyectofinal_quizynema.welcomemsj

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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'welcome_msj'.
 * Generated code; do not edit directly
 */
@Composable
fun WelcomeMsj(
    modifier: Modifier = Modifier,
    welcomeTextnick: String = "",
    letsQuizText: String = "",
    onQuizyAvatarImg: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        WelcomeTextnick(
            welcomeTextnick = welcomeTextnick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 29.0.dp,
                    y = -19.0.dp
                )
            )
        )
        LetsQuizText(
            letsQuizText = letsQuizText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -30.5.dp,
                    y = 17.0.dp
                )
            )
        )
        QuizyAvatarImg(
            onQuizyAvatarImg = onQuizyAvatarImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -147.5.dp,
                    y = -0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 362, heightDp = 93)
@Composable
private fun WelcomeMsjPreview() {
    MaterialTheme {
        RelayContainer {
            WelcomeMsj(
                welcomeTextnick = "Buenos días, Joker1231!",
                letsQuizText = "Hagamos un quiz hoy",
                onQuizyAvatarImg = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun WelcomeTextnick(
    welcomeTextnick: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = welcomeTextnick,
        fontSize = 16.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(264.0.dp)
    )
}

@Composable
fun LetsQuizText(
    letsQuizText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = letsQuizText,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000817435128.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun QuizyAvatarImg(
    onQuizyAvatarImg: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.welcome_msj_quizy_avatar_img),
        radius = 30.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onQuizyAvatarImg).requiredWidth(67.0.dp).requiredHeight(68.0.dp)
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
