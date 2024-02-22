package com.example.proyectofinal_quizynema.views.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.accesousuario.tomorrow

@Composable
fun CustomizedText(
    customizedText: String
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color(
                alpha = 255,
                red = 151,
                green = 168,
                blue = 183
            ),
            fontSize = 14.0.sp,
            fontFamily = tomorrow
        )
    )
}

@Composable
fun CustomizedTextWhite(
    customizedText: String,
    modifier: Modifier
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.White,
            fontSize = 14.0.sp,
            fontFamily = tomorrow
        ),
        modifier = modifier
    )
}

@Composable
fun CustomizedTextWhiteSmaller(
    customizedText: String,
    modifier: Modifier
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.White,
            fontSize = 12.0.sp,
            fontFamily = tomorrow
        ),
        modifier = modifier
    )
}


@Composable
fun CustomizedTextBlack(
    customizedText: String
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.Black,
            fontSize = 14.0.sp,
            fontFamily = tomorrow
        )
    )
}

@Composable
fun CustomizedTextBold(
    customizedText: String
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.White,
            fontSize = 14.0.sp,
            fontFamily = tomorrow,
            fontWeight = FontWeight.Bold // Esta línea establece el texto en negrita
        )
    )
}

@Composable
fun CustomizedTextBoldSmaller(
    customizedText: String,
    modifier: Modifier
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.White,
            fontSize = 12.0.sp,
            fontFamily = tomorrow,
            fontWeight = FontWeight.Bold // Esta línea establece el texto en negrita
        ),
        modifier = modifier
    )
}