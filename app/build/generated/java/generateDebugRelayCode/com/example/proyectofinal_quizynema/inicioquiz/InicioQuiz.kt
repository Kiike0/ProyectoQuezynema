package com.example.proyectofinal_quizynema.inicioquiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
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
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'inicio_quiz'.
 * Generated code; do not edit directly
 */
@Composable
fun InicioQuiz(
    modifier: Modifier = Modifier,
    startText: String = "",
    quizTitleText: String = "",
    quizDesc: String = "",
    onStartButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        StartButton(
            onStartButton = onStartButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 205.5.dp
                )
            )
        )
        StartText(
            startText = startText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 205.5.dp
                )
            )
        )
        RectQuizImg(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -114.0.dp
                )
            )
        )
        LetsQuizImg(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 2.5.dp,
                    y = -114.0.dp
                )
            )
        )
        QuizTitleText(
            quizTitleText = quizTitleText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 58.5.dp
                )
            )
        )
        QuizDesc(
            quizDesc = quizDesc,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 118.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 324, heightDp = 469)
@Composable
private fun InicioQuizPreview() {
    MaterialTheme {
        RelayContainer {
            InicioQuiz(
                onStartButton = {},
                startText = "Iniciar",
                quizTitleText = "¿Lo sabes todo sobre Star Wars?",
                quizDesc = "Responde a las preguntas del Quiz y ganarás puntos por respuesta correcta",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun StartButton(
    onStartButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_quiz_start_button),
        modifier = modifier.tappable(onTap = onStartButton).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun StartText(
    startText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = startText,
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
fun RectQuizImg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_quiz_rect_quiz_img),
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(241.0.dp)
    )
}

@Composable
fun LetsQuizImg(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inicio_quiz_lets_quiz_img),
        radius = 15.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawContent()
                drawRect(
                    color = Color(
                        alpha = 22,
                        red = 25,
                        green = 39,
                        blue = 52
                    )
                )
            }
        ).requiredWidth(303.0.dp).requiredHeight(241.0.dp)
    )
}

@Composable
fun QuizTitleText(
    quizTitleText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizTitleText,
        fontSize = 20.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(324.0.dp)
    )
}

@Composable
fun QuizDesc(
    quizDesc: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizDesc,
        fontSize = 15.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(324.0.dp)
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
