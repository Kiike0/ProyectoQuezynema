package com.example.proyectofinal_quizynema.datosusuario

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

/**
 * This composable was generated from the UI Package 'datos_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun DatosUsuario(
    modifier: Modifier = Modifier,
    pointsNumber: String = "",
    pointsTxt: String = "",
    jugadosNumber: String = "",
    jugadosTxt: String = "",
    puestoNumber: String = "",
    puestoRankingTxt: String = ""
) {
    TopLevel(modifier = modifier) {
        PointsNumber(
            pointsNumber = pointsNumber,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -133.0.dp,
                    y = -9.5.dp
                )
            )
        )
        PointsTxt(
            pointsTxt = pointsTxt,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -130.0.dp,
                    y = 25.5.dp
                )
            )
        )
        JugadosNumber(
            jugadosNumber = jugadosNumber,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -9.5.dp,
                    y = -9.5.dp
                )
            )
        )
        JugadosTxt(
            jugadosTxt = jugadosTxt,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -10.0.dp,
                    y = 25.5.dp
                )
            )
        )
        PuestoNumber(
            puestoNumber = puestoNumber,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 111.5.dp,
                    y = -9.5.dp
                )
            )
        )
        PuestoRankingTxt(
            puestoRankingTxt = puestoRankingTxt,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 114.0.dp,
                    y = 25.5.dp
                )
            )
        )
        SeparationRectangle1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -66.5.dp,
                    y = 0.0.dp
                )
            )
        )
        SeparationRectangle2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 39.5.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 347, heightDp = 70)
@Composable
private fun DatosUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            DatosUsuario(
                pointsNumber = "10",
                pointsTxt = "Puntuación",
                jugadosNumber = "24",
                jugadosTxt = "Jugados",
                puestoNumber = "1",
                puestoRankingTxt = "Puesto Ranking",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun PointsNumber(
    pointsNumber: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = pointsNumber,
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
fun PointsTxt(
    pointsTxt: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = pointsTxt,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun JugadosNumber(
    jugadosNumber: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = jugadosNumber,
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
fun JugadosTxt(
    jugadosTxt: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = jugadosTxt,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun PuestoNumber(
    puestoNumber: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = puestoNumber,
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
fun PuestoRankingTxt(
    puestoRankingTxt: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = puestoRankingTxt,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun SeparationRectangle1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.datos_usuario_separation_rectangle1),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun SeparationRectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.datos_usuario_separation_rectangle2),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(70.0.dp)
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
