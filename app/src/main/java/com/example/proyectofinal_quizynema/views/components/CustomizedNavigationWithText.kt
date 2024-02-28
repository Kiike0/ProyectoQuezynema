package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
import com.example.proyectofinal_quizynema.navegacion.tomorrow
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 * Representa a la navegación superior. Cambia el icono de la flechita por la cruz
 */
@Composable
fun CustomizedNavigationWithText(
    modifier: Modifier = Modifier,
    textNav: String = "",
    onBack: () -> Unit = {}
) {
    CustomizedNavigationTopLevel(modifier = modifier) {
        CustomizedNavigationTextNav(
            textNav = textNav,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 58.900001525878906.dp,
                    y = 0.0.dp
                )
            )
        )
        CustomizedNavigationBackIcon(
            onBack = onBack,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-93.00000190734863).dp,
                    y = (-0.49999427795410156).dp
                )
            )
        )
    }
}

@Composable
fun CustomizedNavigationTextNav(
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
fun CustomizedNavigationBackIcon(
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.navegacion_salir_vector_exit),
        modifier = modifier.tappable(onTap = onBack).requiredWidth(19.799999237060547.dp).requiredHeight(19.799999237060547.dp)
    )
}

@Composable
fun CustomizedNavigationTopLevel(
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