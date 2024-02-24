package com.example.proyectofinal_quizynema.congratscomponent

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
 * This composable was generated from the UI Package 'congrats_component'.
 * Generated code; do not edit directly
 */
@Composable
fun CongratsComponent(
    modifier: Modifier = Modifier,
    onContinueButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ImgRect(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -92.0.dp
                )
            )
        )
        RectBx(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 180.0.dp
                )
            )
        )
        GreatJob(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 141.5.dp
                )
            )
        )
        Congrats(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 101.5.dp
                )
            )
        )
        ContinueButton(
            onContinueButton = onContinueButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 213.0.dp
                )
            )
        )
        Continuar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 213.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 328, heightDp = 544)
@Composable
private fun CongratsComponentPreview() {
    MaterialTheme {
        RelayContainer {
            CongratsComponent(
                onContinueButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImgRect(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.congrats_component_img_rect),
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(360.0.dp)
    )
}

@Composable
fun RectBx(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.congrats_component_rect_bx),
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(184.0.dp)
    )
}

@Composable
fun GreatJob(modifier: Modifier = Modifier) {
    RelayText(
        content = "Has hecho un gran trabajo en el test",
        fontSize = 13.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 212,
            green = 224,
            blue = 155
        ),
        height = 1.200000029343825.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(11.0.dp)
    )
}

@Composable
fun Congrats(modifier: Modifier = Modifier) {
    RelayText(
        content = "¡Felicidades!",
        fontSize = 36.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000211927626.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun ContinueButton(
    onContinueButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.congrats_component_continue_button),
        modifier = modifier.tappable(onTap = onContinueButton).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun Continuar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Continuar",
        fontSize = 20.0.sp,
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
        modifier = modifier
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
