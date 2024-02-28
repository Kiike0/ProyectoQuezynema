package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.preguntaquiz.tomorrow
import com.example.proyectofinal_quizynema.ui.painters.normalAnswerImage
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 * Representa a la composable de cada pregunta
 */
@Composable
fun QuestionsComposable(
    modifier: Modifier = Modifier,
    quizImg: Painter = EmptyPainter(),
    quizTitle: String = "",
    answerText1: String = "",
    answerText2: String = "",
    answerText3: String = "",
    answerText4: String = "",
    onAnswerButton1: () -> Unit = {},
    onAnswerButton2: () -> Unit = {},
    onAnswerButton3: () -> Unit = {},
    onAnswerButton4: () -> Unit = {}
) {
    QuestionsComponentTopLevel(modifier = modifier) {
        QuizImgQC(
            quizImg = quizImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 2.0.dp,
                    y = (-189.5).dp
                )
            )
        )
        QuizTitleQC(
            quizTitle = quizTitle,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = (-8.0).dp
                )
            )
        )
        AnswerButton1QC(
            onAnswerButton1 = onAnswerButton1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 70.5.dp
                )
            )
        )
        AnswerText1QC(
            answerText1 = answerText1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 69.5.dp
                )
            )
        )
        AnswerButton2QC(
            onAnswerButton2 = onAnswerButton2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 136.5.dp
                )
            )
        )
        AnswerText2QC(
            answerText2 = answerText2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 135.5.dp
                )
            )
        )
        AnswerButton3QC(
            onAnswerButton3 = onAnswerButton3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-0.5).dp,
                    y = 202.5.dp
                )
            )
        )
        AnswerText3QC(
            answerText3 = answerText3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-1.0).dp,
                    y = 201.5.dp
                )
            )
        )
        AnswerButton4QC(
            onAnswerButton4 = onAnswerButton4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-0.5).dp,
                    y = 268.5.dp
                )
            )
        )
        AnswerText4QC(
            answerText4 = answerText4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-1.0).dp,
                    y = 267.5.dp
                )
            )
        )
    }
}

@Composable
fun QuizImgQC(
    quizImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = quizImg,
        radius = 15.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(281.0.dp)
    )
}

@Composable
fun QuizTitleQC(
    quizTitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizTitle,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(325.0.dp)
    )
}

@Composable
fun AnswerButton1QC(
    onAnswerButton1: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(normalAnswerImage),
        modifier = modifier.tappable(onTap = onAnswerButton1).requiredWidth(325.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun AnswerText1QC(
    answerText1: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = answerText1,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(292.0.dp)
    )
}

@Composable
fun AnswerButton2QC(
    onAnswerButton2: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(normalAnswerImage),
        modifier = modifier.tappable(onTap = onAnswerButton2).requiredWidth(325.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun AnswerText2QC(
    answerText2: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = answerText2,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(292.0.dp)
    )
}

@Composable
fun AnswerButton3QC(
    onAnswerButton3: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(normalAnswerImage),
        modifier = modifier.tappable(onTap = onAnswerButton3).requiredWidth(325.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun AnswerText3QC(
    answerText3: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = answerText3,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(292.0.dp)
    )
}

@Composable
fun AnswerButton4QC(
    onAnswerButton4: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(normalAnswerImage),
        modifier = modifier.tappable(onTap = onAnswerButton4).requiredWidth(325.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun AnswerText4QC(
    answerText4: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = answerText4,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(292.0.dp)
    )
}

@Composable
fun QuestionsComponentTopLevel(
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