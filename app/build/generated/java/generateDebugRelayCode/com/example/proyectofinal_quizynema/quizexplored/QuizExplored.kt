package com.example.proyectofinal_quizynema.quizexplored

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
 * This composable was generated from the UI Package 'quiz_explored'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizExplored(
    modifier: Modifier = Modifier,
    quizImg: Painter = EmptyPainter(),
    quizTitleText: String = "",
    onBoxQuiz: () -> Unit = {},
    onQuizImg: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BoxQuiz(
            onBoxQuiz = onBoxQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 63.0.dp
                )
            )
        )
        QuizImg(
            onQuizImg = onQuizImg,
            quizImg = quizImg,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -31.5.dp
                )
            )
        )
        QuizTitleText(
            quizTitleText = quizTitleText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 2.0.dp,
                    y = 61.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 166, heightDp = 189)
@Composable
private fun QuizExploredPreview() {
    MaterialTheme {
        RelayContainer {
            QuizExplored(
                onBoxQuiz = {},
                quizImg = painterResource(R.drawable.quiz_explored_quiz_img),
                onQuizImg = {},
                quizTitleText = "¿Lo sabes todo sobre Star Wars?",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxQuiz(
    onBoxQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_explored_box_quiz),
        modifier = modifier.tappable(onTap = onBoxQuiz).requiredWidth(166.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun QuizImg(
    onQuizImg: () -> Unit,
    quizImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = quizImg,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onQuizImg).requiredWidth(166.0.dp).requiredHeight(126.0.dp)
    )
}

@Composable
fun QuizTitleText(
    quizTitleText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizTitleText,
        fontSize = 13.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.200000029343825.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(152.0.dp)
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
