package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.congratscomponent.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'congrats_component'.
 * Generated code; do not edit directly
 */
@Composable
fun CustomizedButton(
    onCreateButton: () -> Unit = {},
    modifier: Modifier
) {
        ButtonBlue(
            onCreateButton = onCreateButton,
            modifier = modifier
        )

}

@Composable
fun ButtonBlue(
    onCreateButton: () -> Unit,
    modifier: Modifier
) {
    Button(
        onClick = onCreateButton,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
            .width(230.0.dp)
            .height(58.0.dp)
            .border(
                width = 4.dp,
                color = Color.White,
                shape = RoundedCornerShape(25.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = BackGroundAccessBox
        )
    ) {
        TextButton()
    }
}

@Composable
fun TextButton(modifier: Modifier = Modifier) {
    RelayText(
        content = "Crear",
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