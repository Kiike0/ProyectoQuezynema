package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.google.relay.compose.RelayVector

/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 * Representa a las quiz más populares
 */
@Composable
fun PopularQuiz(
    times: String = "",
    quizTitle: String = "",
    onQuizButton: () -> Unit = {}
) {
    Box(
        Modifier
            .size(128.0.dp, 88.0.dp)
            .background(BackGroundAccessBox, RoundedCornerShape(20.dp))
            .clickable(
                onClick = onQuizButton
            )
    ){
        Column{
            CustomizedTextBoldSmaller(customizedText = quizTitle, Modifier.padding(start = 10.dp, top = 10.dp))
            Row{
                VectorFilmMod(
                    modifier = Modifier.padding(start = 10.dp, top = 23.5.dp)
                )
                CustomizedTextWhite(customizedText = times, Modifier.padding(start = 10.dp, top = 25.dp))
            }
        }
    }
}

@Composable
fun VectorFilmMod(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_vector_film),
        modifier = modifier
            .requiredWidth(11.625.dp)
            .requiredHeight(9.375.dp)
    )
}

