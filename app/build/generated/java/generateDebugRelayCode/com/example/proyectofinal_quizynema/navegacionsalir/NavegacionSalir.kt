package com.example.proyectofinal_quizynema.navegacionsalir

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
 * This composable was generated from the UI Package 'navegacion_salir'.
 * Generated code; do not edit directly
 */
@Composable
fun NavegacionSalir(
    modifier: Modifier = Modifier,
    questionNum: String = "",
    onExitButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        QuestionNum(
            questionNum = questionNum,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -34.0.dp,
                    y = -1.5.dp
                )
            )
        )
        ExitButton(
            onExitButton = onExitButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 129.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 290, heightDp = 32)
@Composable
private fun NavegacionSalirPreview() {
    MaterialTheme {
        RelayContainer {
            NavegacionSalir(
                questionNum = "Primera pregunta",
                onExitButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun QuestionNum(
    questionNum: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = questionNum,
        fontSize = 24.0.sp,
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
        modifier = modifier
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.navegacion_salir_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.002685546875.dp,
                top = 4.0.dp,
                end = 3.997314453125.dp,
                bottom = 4.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.navegacion_salir_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.0.dp,
                top = 10.666656494140625.dp,
                end = 10.666664123535156.dp,
                bottom = 10.666679382324219.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ExitButton(
    onExitButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onExitButton).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
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
