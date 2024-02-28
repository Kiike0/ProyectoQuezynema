package com.example.proyectofinal_quizynema.barranavegacion

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.proyectofinal_quizynema.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'barra_navegacion'.
 * Generated code; do not edit directly
 */
@Composable
fun BarraNavegacion(
    modifier: Modifier = Modifier,
    onCerrarSesion: () -> Unit = {},
    onAgregar: () -> Unit = {},
    onHome: () -> Unit = {},
    onVerQuizzes: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        RectanguloBarra(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        CerrarSesionIcon(
            onCerrarSesion = onCerrarSesion,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 129.0.dp,
                    y = -1.5.dp
                )
            )
        ) {
            CerrarSesionVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        AgregarIcon(
            onAgregar = onAgregar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -44.0.dp,
                    y = -0.5.dp
                )
            )
        ) {
            AgregarVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        HomeIcon(
            onHome = onHome,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -127.5.dp,
                    y = -1.0.dp
                )
            )
        ) {
            HomeVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        VerQuizIcon(
            onVerQuizzes = onVerQuizzes,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = -2.0.dp
                )
            )
        ) {
            VerQuizVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 393, heightDp = 68)
@Composable
private fun BarraNavegacionPreview() {
    MaterialTheme {
        RelayContainer {
            BarraNavegacion(
                onCerrarSesion = {},
                onAgregar = {},
                onHome = {},
                onVerQuizzes = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RectanguloBarra(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_rectangulo_barra),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun CerrarSesionVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_cerrar_sesion_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.75.dp,
                top = 6.757568359375.dp,
                end = 3.756134033203125.dp,
                bottom = 7.501157760620117.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CerrarSesionIcon(
    onCerrarSesion: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onCerrarSesion).requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun AgregarVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_agregar_vector),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AgregarIcon(
    onAgregar: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onAgregar).requiredWidth(33.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun HomeVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_home_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.408935546875.dp,
                top = 3.4583740234375.dp,
                end = 3.3333282470703125.dp,
                bottom = 3.3332901000976562.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HomeIcon(
    onHome: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onHome).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun VerQuizVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_ver_quiz_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.33331298828125.dp,
                top = 6.6666259765625.dp,
                end = 1.66668701171875.dp,
                bottom = 1.66668701171875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VerQuizIcon(
    onVerQuizzes: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onVerQuizzes).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
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
