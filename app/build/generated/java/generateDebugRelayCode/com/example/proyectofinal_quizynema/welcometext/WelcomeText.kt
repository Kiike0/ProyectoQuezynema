package com.example.proyectofinal_quizynema.welcometext

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'welcome_text'.
 * Generated code; do not edit directly
 */
@Composable
fun WelcomeText(
    modifier: Modifier = Modifier,
    joinAndPlay: String = ""
) {
    TopLevel(modifier = modifier) {
        JoinAndPlay(
            joinAndPlay = joinAndPlay,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 207, heightDp = 38)
@Composable
private fun WelcomeTextPreview() {
    MaterialTheme {
        RelayContainer {
            WelcomeText(
                joinAndPlay = "Únete y juega para ampliar tu conocimiento cinéfilo",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun JoinAndPlay(
    joinAndPlay: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = joinAndPlay,
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
