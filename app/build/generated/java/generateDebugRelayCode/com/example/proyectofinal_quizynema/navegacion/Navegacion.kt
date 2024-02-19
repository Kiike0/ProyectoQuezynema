package com.example.proyectofinal_quizynema.navegacion

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
 * This composable was generated from the UI Package 'navegacion'.
 * Generated code; do not edit directly
 */
@Composable
fun Navegacion(
    modifier: Modifier = Modifier,
    textNav: String = "",
    onBack: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TextNav(
            textNav = textNav,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 58.900001525878906.dp,
                    y = 0.0.dp
                )
            )
        )
        BackIcon(
            onBack = onBack,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -93.00000190734863.dp,
                    y = -0.49999427795410156.dp
                )
            )
        )
    }
}

@Preview(widthDp = 206, heightDp = 29)
@Composable
private fun NavegacionPreview() {
    MaterialTheme {
        RelayContainer {
            Navegacion(
                textNav = "Cuenta",
                onBack = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TextNav(
    textNav: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textNav,
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
fun BackIcon(
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.navegacion_back_icon),
        modifier = modifier.tappable(onTap = onBack).requiredWidth(19.799999237060547.dp).requiredHeight(19.799999237060547.dp)
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
