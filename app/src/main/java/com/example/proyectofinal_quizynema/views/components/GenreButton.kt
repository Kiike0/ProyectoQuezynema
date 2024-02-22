package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.wear.compose.material.Text
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.botongenre.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'boton_genre'.
 * Generated code; do not edit directly
 */
@Composable
fun GenreButton(
    genreText: String = "",
    onButtonGenre: () -> Unit = {}
) {
    Button(
        onClick = { onButtonGenre() },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BackGroundApp,
            contentColor = Color.White
        ),
        border = BorderStroke(1.5.dp, Color.White)

    ) {
        // Muestra el texto del género que se pasa como argumento
        CustomizedTextBold(genreText)
    }
}