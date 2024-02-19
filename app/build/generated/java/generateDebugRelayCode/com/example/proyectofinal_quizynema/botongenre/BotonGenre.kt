package com.example.proyectofinal_quizynema.botongenre

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
 * This composable was generated from the UI Package 'boton_genre'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonGenre(
    modifier: Modifier = Modifier,
    genreText: String = "",
    onButtonGenre: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ButtonGenre(
            onButtonGenre = onButtonGenre,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        GenreText(
            genreText = genreText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.5.dp,
                    y = -2.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 129, heightDp = 32)
@Composable
private fun BotonGenrePreview() {
    MaterialTheme {
        RelayContainer {
            BotonGenre(
                onButtonGenre = {},
                genreText = "Ciencia ficción",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ButtonGenre(
    onButtonGenre: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.boton_genre_button_genre),
        modifier = modifier.tappable(onTap = onButtonGenre).requiredWidth(129.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun GenreText(
    genreText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = genreText,
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
