package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.congratscomponent.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundCard2

import com.google.relay.compose.RelayText


/**
 * This composable was generated from the UI Package 'congrats_component'.
 * Generated code; do not edit directly
 */
@Composable
fun Congratulations(
    greatJobText: String,
    onContinueButton: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 110.dp)
    ) {
        ImgCongrats()
        BoxCongrats(
            greatJobText = greatJobText,
            onContinueButton = onContinueButton
        )
    }
}

@Composable
fun ImgCongrats() {
    Image(
        painter = painterResource(R.drawable.congratsimg),
        contentDescription = "Descripción de la imagen",
        modifier = Modifier
            .width(328.0.dp)
            .height(360.0.dp)
    )
}

@Composable
fun BoxCongrats(
    greatJobText: String,
    onContinueButton: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .width(326.2.dp)
            .height(190.0.dp)
            .background(
                color = BackGroundCard2,
                shape = RoundedCornerShape(0.dp,0.dp, 20.dp, 20.dp)
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            CongratulationsText(
            )
            GreatJobTextCongrats(
                greatJobText = greatJobText
            )
            ButtonCongrats(
                onContinueButton = onContinueButton
            )
        }
    }
}
@Composable
fun CongratulationsText() {
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
        modifier = Modifier
            .requiredWidth(296.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun GreatJobTextCongrats(
    greatJobText: String
) {
    RelayText(
        content = greatJobText,
        fontSize = 14.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 212,
            green = 224,
            blue = 155
        ),
        height = 1.200000029343825.em,
        maxLines = -1,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(top = 20.dp)
    )
}


@Composable
fun ButtonCongrats(
    onContinueButton: () -> Unit
) {
    Button(
        onClick = onContinueButton,
        modifier = Modifier
            .padding(top = 20.dp)
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
        ContinuarCongrats()
    }
}

@Composable
fun ContinuarCongrats(modifier: Modifier = Modifier) {
    RelayText(
        content = "Salir",
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
