package com.example.proyectofinal_quizynema.quizsinterminar

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
 * This composable was generated from the UI Package 'quiz_sin_terminar'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizSinTerminar(
    modifier: Modifier = Modifier,
    pointstext: String = "",
    iniciadaText: String = "",
    titleUnfinishedQuiz: String = "",
    onImageButtonUQ: () -> Unit = {},
    onRectangleButtonUQ: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        OnImageButtonUQ(
            onImageButtonUQ = onImageButtonUQ,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -124.5.dp,
                    y = 0.0.dp
                )
            )
        )
        OnRectangleButtonUQ(
            onRectangleButtonUQ = onRectangleButtonUQ,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 42.5.dp,
                    y = 0.0.dp
                )
            )
        )
        Points(
            pointstext = pointstext,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 117.0.dp,
                    y = 9.0.dp
                )
            )
        )
        ThrophyIcon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 94.0.dp,
                    y = 9.0.dp
                )
            )
        ) {
            VectorIcon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IniciadaText(
            iniciadaText = iniciadaText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -10.0.dp,
                    y = 9.0.dp
                )
            )
        )
        TitleUnfinishedQuiz(
            titleUnfinishedQuiz = titleUnfinishedQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 34.5.dp,
                    y = -24.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 334, heightDp = 68)
@Composable
private fun QuizSinTerminarPreview() {
    MaterialTheme {
        RelayContainer {
            QuizSinTerminar(
                onImageButtonUQ = {},
                onRectangleButtonUQ = {},
                pointstext = "5/10",
                iniciadaText = "Iniciada sin terminar",
                titleUnfinishedQuiz = "Conoce la saga Scream",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun OnImageButtonUQ(
    onImageButtonUQ: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.quiz_sin_terminar_on_image_button_uq),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onImageButtonUQ).requiredWidth(85.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun OnRectangleButtonUQ(
    onRectangleButtonUQ: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_sin_terminar_on_rectangle_button_uq),
        modifier = modifier.tappable(onTap = onRectangleButtonUQ).requiredWidth(249.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun Points(
    pointstext: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = pointstext,
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
fun VectorIcon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_sin_terminar_vector_icon),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.1875.dp,
                top = 1.6875.dp,
                end = 0.1875.dp,
                bottom = 0.9375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ThrophyIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun IniciadaText(
    iniciadaText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = iniciadaText,
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
fun TitleUnfinishedQuiz(
    titleUnfinishedQuiz: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = titleUnfinishedQuiz,
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
        modifier = modifier.requiredWidth(193.0.dp)
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
