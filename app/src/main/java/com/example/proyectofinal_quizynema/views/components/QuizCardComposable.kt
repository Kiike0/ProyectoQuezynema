package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.quizexplored.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundCard2
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable


/**
 * This composable was generated from the UI Package 'quiz_explored'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizCardComposable(
    modifier: Modifier = Modifier,
    quizImg: Painter = EmptyPainter(),
    quizTitleText: String = "",
    onBoxQuiz: () -> Unit = {},
    onQuizImg: () -> Unit = {}
) {
    TopLevelQuizCard(modifier = modifier) {
        BoxQuizQuizCard(
            onBoxQuiz = onBoxQuiz,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 63.0.dp
                )
            )
        )
        QuizImgQuizCard(
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
        QuizTitleTextQuizCard(
            quizTitleText = quizTitleText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 61.5.dp
                )
            )
        )
    }
}


@Composable
fun BoxQuizQuizCard(
    onBoxQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.quiz_explored_box_quiz),
        modifier = modifier
            .tappable(onTap = onBoxQuiz)
            .requiredWidth(166.0.dp)
            .requiredHeight(63.0.dp)
    )
}

@Composable
fun QuizImgQuizCard(
    onQuizImg: () -> Unit,
    quizImg: Painter,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .tappable(onTap = onQuizImg)
            .requiredWidth(166.0.dp)
            .requiredHeight(126.0.dp)
            .clip(RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
            .background(BackGroundCard2)
    ){
        Image(
            painter = quizImg,
            contentDescription = "Quiz card image",
            contentScale = ContentScale.FillBounds, // Ajuste de contentScale para que ocupe toda la Box
            modifier = Modifier.fillMaxSize()
        )
    }

}

@Composable
fun QuizTitleTextQuizCard(
    quizTitleText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizTitleText,
        fontSize = 14.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.200000029343825.em,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.SemiBold,
        maxLines = -1,
        modifier = modifier.requiredWidth(152.0.dp)
    )
}

@Composable
fun TopLevelQuizCard(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
