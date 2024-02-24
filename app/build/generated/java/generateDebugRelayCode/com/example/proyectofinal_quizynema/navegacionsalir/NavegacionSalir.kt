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
    textQuestionNumber: String = "",
    onExit: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TextQuestionNumber(
            textQuestionNumber = textQuestionNumber,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -32.0.dp,
                    y = -1.5.dp
                )
            )
        )
        ExitIcon(
            onExit = onExit,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -94.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            VectorExit(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 290, heightDp = 32)
@Composable
private fun NavegacionSalirPreview() {
    MaterialTheme {
        RelayContainer {
            NavegacionSalir(
                textQuestionNumber = "1/5",
                onExit = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TextQuestionNumber(
    textQuestionNumber: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textQuestionNumber,
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
fun VectorExit(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.navegacion_salir_vector_exit),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.626678466796875.dp,
                top = 5.626678466796875.dp,
                end = 5.639986038208008.dp,
                bottom = 5.626644134521484.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ExitIcon(
    onExit: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onExit).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
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
