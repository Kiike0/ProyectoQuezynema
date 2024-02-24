package com.example.proyectofinal_quizynema.quizsugerida

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
 * This composable was generated from the UI Package 'quiz_sugerida'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizSugerida(
    modifier: Modifier = Modifier,
    quizsuggest: String = "",
    comenzar: String = "",
    img: Painter = EmptyPainter(),
    onComenzarButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Card(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -6.5.dp
                )
            )
        )
        Quizsuggest(
            quizsuggest = quizsuggest,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -69.5.dp,
                    y = -40.5.dp
                )
            )
        )
        RectButton(
            onComenzarButton = onComenzarButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -79.5.dp,
                    y = 24.5.dp
                )
            )
        )
        Comenzar(
            comenzar = comenzar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -79.0.dp,
                    y = 24.5.dp
                )
            )
        )
        Img(
            img = img,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 89.0.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 344, heightDp = 184)
@Composable
private fun QuizSugeridaPreview() {
    MaterialTheme {
        RelayContainer {
            QuizSugerida(
                quizsuggest = "Empieza una quiz elegida al azar",
                onComenzarButton = {},
                comenzar = "Comenzar",
                img = painterResource(R.drawable.quiz_sugerida_img),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_sugerida_card),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(171.0.dp)
    )
}

@Composable
fun Quizsuggest(
    quizsuggest: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizsuggest,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(129.0.dp)
    )
}

@Composable
fun RectButton(
    onComenzarButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_sugerida_rect_button),
        modifier = modifier.tappable(onTap = onComenzarButton).requiredWidth(109.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun Comenzar(
    comenzar: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = comenzar,
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
fun Img(
    img: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = img,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(184.0.dp)
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
