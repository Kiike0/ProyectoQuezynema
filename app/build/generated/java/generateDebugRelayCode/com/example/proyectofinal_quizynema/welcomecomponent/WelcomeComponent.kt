package com.example.proyectofinal_quizynema.welcomecomponent

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
 * This composable was generated from the UI Package 'welcome_component'.
 * Generated code; do not edit directly
 */
@Composable
fun WelcomeComponent(
    modifier: Modifier = Modifier,
    playNowTextButton: String = "",
    welcomeText: String = "",
    nameAppImg: Painter = EmptyPainter(),
    onButtonPlayNow: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        RectangleButton(
            onButtonPlayNow = onButtonPlayNow,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = 113.0.dp
                )
            )
        )
        PlayNowText(
            playNowTextButton = playNowTextButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = 113.0.dp
                )
            )
        )
        WelcomeText(
            welcomeText = welcomeText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.5.dp,
                    y = 37.0.dp
                )
            )
        )
        NameApp(
            nameAppImg = nameAppImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -65.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 270, heightDp = 284)
@Composable
private fun WelcomeComponentPreview() {
    MaterialTheme {
        RelayContainer {
            WelcomeComponent(
                onButtonPlayNow = {},
                playNowTextButton = "Play Now",
                welcomeText = "Únete y juega para ampliar tu conocimiento cinéfilo",
                nameAppImg = painterResource(R.drawable.welcome_component_name_app),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RectangleButton(
    onButtonPlayNow: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.welcome_component_rectangle_button),
        modifier = modifier.tappable(onTap = onButtonPlayNow).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun PlayNowText(
    playNowTextButton: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = playNowTextButton,
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
fun WelcomeText(
    welcomeText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = welcomeText,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(207.0.dp)
    )
}

@Composable
fun NameApp(
    nameAppImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = nameAppImg,
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
