package com.example.proyectofinal_quizynema.progresoquiz

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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'progreso_quiz'.
 * Generated code; do not edit directly
 */
@Composable
fun ProgresoQuiz(
    modifier: Modifier = Modifier,
    completedTimes: String = "",
    titleQuiz: String = "",
    onCardPopularQuiz: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        CardPopularQuiz(
            onCardPopularQuiz = onCardPopularQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        CompletedTimes(
            completedTimes = completedTimes,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.0.dp,
                    y = 20.0.dp
                )
            )
        )
        TitleQuiz(
            titleQuiz = titleQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -18.0.dp
                )
            )
        )
        IconFilm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -48.5.dp,
                    y = 20.5.dp
                )
            )
        ) {
            VectorFilm(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 128, heightDp = 88)
@Composable
private fun ProgresoQuizPreview() {
    MaterialTheme {
        RelayContainer {
            ProgresoQuiz(
                onCardPopularQuiz = {},
                completedTimes = "5 completadas",
                titleQuiz = "¿Lo sabes todo sobre Star Wars?",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun CardPopularQuiz(
    onCardPopularQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_card_popular_quiz),
        modifier = modifier.tappable(onTap = onCardPopularQuiz).requiredWidth(128.0.dp).requiredHeight(88.0.dp)
    )
}

@Composable
fun CompletedTimes(
    completedTimes: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = completedTimes,
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
fun TitleQuiz(
    titleQuiz: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = titleQuiz,
        fontSize = 12.0.sp,
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
        modifier = modifier.requiredWidth(112.0.dp)
    )
}

@Composable
fun VectorFilm(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_vector_film),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.625.dp,
                top = 0.625.dp,
                end = 0.000003814697265625.dp,
                bottom = 0.6249971389770508.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconFilm(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(15.0.dp)
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
