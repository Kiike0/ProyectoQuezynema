package com.example.proyectofinal_quizynema.botonesusuario

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
 * This composable was generated from the UI Package 'botones_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonesUsuario(
    modifier: Modifier = Modifier,
    editarPerfilText: String = "",
    verRankingText: String = "",
    onEditarPerfilButton: () -> Unit = {},
    onRankingButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        EditarPerfilButton(
            onEditarPerfilButton = onEditarPerfilButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -93.0.dp,
                    y = 0.0.dp
                )
            )
        )
        EditarPerfilText(
            editarPerfilText = editarPerfilText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -94.5.dp,
                    y = -1.0.dp
                )
            )
        )
        RankingButton(
            onRankingButton = onRankingButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 93.0.dp,
                    y = 0.0.dp
                )
            )
        )
        VerRankingText(
            verRankingText = verRankingText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 93.5.dp,
                    y = -1.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 345, heightDp = 36)
@Composable
private fun BotonesUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            BotonesUsuario(
                onEditarPerfilButton = {},
                editarPerfilText = "Editar Perfil",
                onRankingButton = {},
                verRankingText = "Ver Ranking",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun EditarPerfilButton(
    onEditarPerfilButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_editar_perfil_button),
        modifier = modifier.tappable(onTap = onEditarPerfilButton).requiredWidth(159.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun EditarPerfilText(
    editarPerfilText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = editarPerfilText,
        fontSize = 18.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000211927626.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RankingButton(
    onRankingButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_ranking_button),
        modifier = modifier.tappable(onTap = onRankingButton).requiredWidth(159.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun VerRankingText(
    verRankingText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = verRankingText,
        fontSize = 18.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000211927626.em,
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
