package com.example.proyectofinal_quizynema.preguntaquiz

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
 * This composable was generated from the UI Package 'pregunta_quiz'.
 * Generated code; do not edit directly
 */
@Composable
fun PreguntaQuiz(
    modifier: Modifier = Modifier,
    imgQuestionImageContent: Painter = EmptyPainter(),
    questionDesc: String = "",
    question1: String = "",
    question2: String = "",
    question3: String = "",
    question4: String = "",
    confirmAnswer: String = "",
    onQuestion1Button: () -> Unit = {},
    onQuestion2Button: () -> Unit = {},
    onQuestion3Button: () -> Unit = {},
    onQuestion4Button: () -> Unit = {},
    onButtonConfirm: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        CardBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        ImgQuestion(
            imgQuestionImageContent = imgQuestionImageContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -160.5.dp
                )
            )
        )
        QuestionDesc(
            questionDesc = questionDesc,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -4.5.dp,
                    y = 24.0.dp
                )
            )
        )
        Question1Button(
            onQuestion1Button = onQuestion1Button,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -76.5.dp,
                    y = 97.0.dp
                )
            )
        )
        Question1(
            question1 = question1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -77.5.dp,
                    y = 95.0.dp
                )
            )
        )
        Question2Button(
            onQuestion2Button = onQuestion2Button,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 76.5.dp,
                    y = 97.0.dp
                )
            )
        )
        Question2(
            question2 = question2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 76.5.dp,
                    y = 94.0.dp
                )
            )
        )
        Question3Button(
            onQuestion3Button = onQuestion3Button,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -76.5.dp,
                    y = 163.0.dp
                )
            )
        )
        Question3(
            question3 = question3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -75.5.dp,
                    y = 163.0.dp
                )
            )
        )
        Question4Button(
            onQuestion4Button = onQuestion4Button,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 76.5.dp,
                    y = 163.0.dp
                )
            )
        )
        Question4(
            question4 = question4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 78.5.dp,
                    y = 163.0.dp
                )
            )
        )
        ConfirmAnswer(
            confirmAnswer = confirmAnswer,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -7.0.dp,
                    y = 243.5.dp
                )
            )
        )
        ButtonConfirm(
            onButtonConfirm = onButtonConfirm,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -7.5.dp,
                    y = 243.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 344, heightDp = 660)
@Composable
private fun PreguntaQuizPreview() {
    MaterialTheme {
        RelayContainer {
            PreguntaQuiz(
                imgQuestionImageContent = painterResource(R.drawable.pregunta_quiz_img_question),
                questionDesc = "¿Cuál de estas frases dice Yoda en alguna de las películas?",
                onQuestion1Button = {},
                question1 = "El mejor profesor, el fracaso es",
                onQuestion2Button = {},
                question2 = "El miedo, al fracaso conduce",
                onQuestion3Button = {},
                question3 = "Si creer no puedes, es por eso que debes",
                onQuestion4Button = {},
                question4 = "Imposible nada es, fácil muchas cosas son",
                confirmAnswer = "Confirmar respuesta",
                onButtonConfirm = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun CardBox(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_card_box),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(660.0.dp)
    )
}

@Composable
fun ImgQuestion(
    imgQuestionImageContent: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imgQuestionImageContent,
        radius = 15.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(281.0.dp)
    )
}

@Composable
fun QuestionDesc(
    questionDesc: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = questionDesc,
        fontSize = 15.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(281.0.dp)
    )
}

@Composable
fun Question1Button(
    onQuestion1Button: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_question1button),
        modifier = modifier.tappable(onTap = onQuestion1Button).requiredWidth(143.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Question1(
    question1: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = question1,
        fontSize = 12.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(123.0.dp)
    )
}

@Composable
fun Question2Button(
    onQuestion2Button: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_question2button),
        modifier = modifier.tappable(onTap = onQuestion2Button).requiredWidth(143.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Question2(
    question2: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = question2,
        fontSize = 12.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(123.0.dp)
    )
}

@Composable
fun Question3Button(
    onQuestion3Button: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_question3button),
        modifier = modifier.tappable(onTap = onQuestion3Button).requiredWidth(143.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Question3(
    question3: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = question3,
        fontSize = 12.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(123.0.dp)
    )
}

@Composable
fun Question4Button(
    onQuestion4Button: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_question4button),
        modifier = modifier.tappable(onTap = onQuestion4Button).requiredWidth(143.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Question4(
    question4: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = question4,
        fontSize = 12.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(123.0.dp)
    )
}

@Composable
fun ConfirmAnswer(
    confirmAnswer: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = confirmAnswer,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun ButtonConfirm(
    onButtonConfirm: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_quiz_button_confirm),
        modifier = modifier.tappable(onTap = onButtonConfirm).requiredWidth(193.0.dp).requiredHeight(49.0.dp)
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
