package com.example.proyectofinal_quizynema.botonesusuario

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
 * This composable was generated from the UI Package 'botones_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonesUsuario(
    modifier: Modifier = Modifier,
    playMoreText: String = "",
    signOutText: String = "",
    onPlayAgainIcon: () -> Unit = {},
    onSignOutIcon: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        PlayAgainIcon(
            onPlayAgainIcon = onPlayAgainIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -86.0.dp,
                    y = -15.5.dp
                )
            )
        ) {
            VectorAgain(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorPlay(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        PlayMoreText(
            playMoreText = playMoreText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -83.5.dp,
                    y = 44.5.dp
                )
            )
        )
        SignOutIcon(
            onSignOutIcon = onSignOutIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 99.0.dp,
                    y = -16.5.dp
                )
            )
        ) {
            VectorSignOut(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        SignOutText(
            signOutText = signOutText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 92.5.dp,
                    y = 44.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 285, heightDp = 108)
@Composable
private fun BotonesUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            BotonesUsuario(
                onPlayAgainIcon = {},
                playMoreText = "Juega una más",
                onSignOutIcon = {},
                signOutText = "Cierra sesión",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun VectorAgain(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_vector_again),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.375.dp,
                top = 3.125.dp,
                end = 9.374992370605469.dp,
                bottom = 6.249992370605469.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorPlay(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_vector_play),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 29.765625.dp,
                top = 31.56414794921875.dp,
                end = 26.243318557739258.dp,
                bottom = 22.564727783203125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun PlayAgainIcon(
    onPlayAgainIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onPlayAgainIcon).requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun PlayMoreText(
    playMoreText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = playMoreText,
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
fun VectorSignOut(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_vector_sign_out),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.25.dp,
                top = 11.262542724609375.dp,
                end = 6.260231018066406.dp,
                bottom = 12.502010345458984.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SignOutIcon(
    onSignOutIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onSignOutIcon).requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun SignOutText(
    signOutText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = signOutText,
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
