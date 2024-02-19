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
    greetings: String = "",
    letsQuiz: String = "",
    avatarImg: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Greetings(
            greetings = greetings,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -62.0.dp,
                    y = -16.0.dp
                )
            )
        )
        LetsQuiz(
            letsQuiz = letsQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -89.0.dp,
                    y = 18.5.dp
                )
            )
        )
        AvatarImg(
            avatarImg = avatarImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 152.0.dp,
                    y = -8.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 344, heightDp = 56)
@Composable
private fun WelcomeMsjPreview() {
    MaterialTheme {
        RelayContainer {
            WelcomeMsj(
                greetings = "Buenos días, Senpai!",
                letsQuiz = "Hagamos un quiz hoy",
                avatarImg = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Greetings(
    greetings: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = greetings,
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
fun LetsQuiz(
    letsQuiz: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = letsQuiz,
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
        modifier = modifier
    )
}

@Composable
fun AvatarImg(
    avatarImg: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.welcome_msj_avatar_img),
        radius = 30.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = avatarImg).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
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
