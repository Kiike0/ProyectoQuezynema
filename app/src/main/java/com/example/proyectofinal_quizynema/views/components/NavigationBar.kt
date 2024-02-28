package com.example.proyectofinal_quizynema.views.components

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
fun NavigationBar(
    modifier: Modifier = Modifier,
    onCerrarSesion: () -> Unit = {},
    onAgregar: () -> Unit = {},
    onHome: () -> Unit = {},
    onVerQuizzes: () -> Unit = {}
) {
    BotLevel(modifier = modifier) {
        RectanguloBarraCutomized(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        CerrarSesionIconCutomized(
            onCerrarSesion = onCerrarSesion,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 129.0.dp,
                    y = -1.5.dp
                )
            )
        ) {
            CerrarSesionVectorCutomized(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        AgregarIconCutomized(
            onAgregar = onAgregar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -44.0.dp,
                    y = -0.5.dp
                )
            )
        ) {
            AgregarVectorCutomized(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        HomeIconCutomized(
            onHome = onHome,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -127.5.dp,
                    y = -1.0.dp
                )
            )
        ) {
            HomeVectorCutomized(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        VerQuizIconCutomized(
            onVerQuizzes = onVerQuizzes,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = -2.0.dp
                )
            )
        ) {
            VerQuizVectorCutomized(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun RectanguloBarraCutomized(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_rectangulo_barra),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun CerrarSesionVectorCutomized(modifier: Modifier = Modifier) {
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
fun CerrarSesionIconCutomized(
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
fun AgregarVectorCutomized(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_agregar_vector),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AgregarIconCutomized(
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
fun HomeVectorCutomized(modifier: Modifier = Modifier) {
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
fun HomeIconCutomized(
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
fun VerQuizVectorCutomized(modifier: Modifier = Modifier) {
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
fun VerQuizIconCutomized(
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
fun BotLevel(
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