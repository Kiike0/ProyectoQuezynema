package com.example.proyectofinal_quizynema.quizexplored

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'quiz_explored'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizExplored(
    modifier: Modifier = Modifier,
    quizImg: () -> Unit = {},
    quizTitle: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        QuizImg(
            quizImg = quizImg,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        QuizTitle(
            quizTitle = quizTitle,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 166, heightDp = 189)
@Composable
private fun QuizExploredPreview() {
    MaterialTheme {
        RelayContainer {
            QuizExplored(
                quizImg = {},
                quizTitle = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun QuizImg(
    quizImg: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.quiz_explored_quiz_img),
        radius = 15.0,
        strokeColor = Color(
            alpha = 255,
            red = 255,
            green = 211,
            blue = 126
        ),
        strokeWidth = 2.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 63.0.dp
            )
        ).tappable(onTap = quizImg).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun QuizTitle(
    quizTitle: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "¿Lo sabes todo sobre Star Wars?",
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
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 153.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = quizTitle).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
