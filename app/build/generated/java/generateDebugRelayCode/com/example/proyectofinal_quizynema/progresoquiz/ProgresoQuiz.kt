package com.example.proyectofinal_quizynema.progresoquiz

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
    points: String = "",
    quizTitle: String = "",
    onQuizButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        RectangleButton(
            onQuizButton = onQuizButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Points(
            points = points,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -28.0.dp,
                    y = 20.0.dp
                )
            )
        )
        QuizTitle(
            quizTitle = quizTitle,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -18.0.dp
                )
            )
        )
        VectorTrophy(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -49.0.dp,
                    y = 20.375.dp
                )
            )
        )
    }
}

@Preview(widthDp = 128, heightDp = 88)
@Composable
private fun ProgresoQuizPreview() {
    MaterialTheme {
        RelayContainer {
            ProgresoQuiz(
                onQuizButton = {},
                points = "3/5",
                quizTitle = "¿Lo sabes todo sobre Star Wars?",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RectangleButton(
    onQuizButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_rectangle_button),
        modifier = modifier.tappable(onTap = onQuizButton).requiredWidth(128.0.dp).requiredHeight(88.0.dp)
    )
}

@Composable
fun Points(
    points: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = points,
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
fun QuizTitle(
    quizTitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizTitle,
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
fun VectorTrophy(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_vector_trophy),
        modifier = modifier.requiredWidth(11.625.dp).requiredHeight(9.375.dp)
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
