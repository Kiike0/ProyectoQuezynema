package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.progresoquiz.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundCard
import com.google.relay.compose.BoxScopeInstance.boxAlign
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
fun ProgresoBox(
    points: String = "",
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
        Column(){
            CustomizedTextBoldSmaller(customizedText = quizTitle, Modifier.padding(start = 10.dp, top = 10.dp))
            Row(){
                VectorTrophyMod(
                    modifier = Modifier.padding(start = 10.dp, top = 23.5.dp)
                )
                CustomizedTextWhite(customizedText = points, Modifier.padding(start = 10.dp, top = 20.dp))
            }
        }
    }
}

@Composable
fun VectorTrophyMod(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.progreso_quiz_vector_trophy),
        modifier = modifier
            .requiredWidth(11.625.dp)
            .requiredHeight(9.375.dp)
    )
}

