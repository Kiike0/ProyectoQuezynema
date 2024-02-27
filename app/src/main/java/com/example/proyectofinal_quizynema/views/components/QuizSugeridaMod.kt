package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.quizsugerida.tomorrow
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.ui.theme.BackGroundCard
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'quiz_sugerida'.
 * Generated code; do not edit directly
 */
@Composable
fun QuizSugeridaMod(
    modifier: Modifier = Modifier,
    img: Painter = EmptyPainter(),
    onComenzarButton: () -> Unit = {}
) {
    Box(
        Modifier
            .size(330.0.dp, 184.0.dp)
            .background(BackGroundCard, RoundedCornerShape(20.dp))
    ){
        Row(){
            Column(){
                Spacer(Modifier.height(20.dp))

                QuizsuggestMod(
                    quizsuggest = "Empieza una quiz elegida al azar",
                    modifier = Modifier.padding(start= 20.dp)
                )

                Spacer(Modifier.height(20.dp))

                Button(
                    onClick = {
                        onComenzarButton()
                              },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BackGroundCard,
                        contentColor = BackGroundCard
                    ),
                    border = BorderStroke(2.dp, Color.Black),
                    modifier = Modifier.padding(start = 20.dp)

                ) {
                    // Muestra el texto del género que se pasa como argumento
                    CustomizedTextBlack("Comenzar")
                }

            }

            Spacer(Modifier.width(40.dp))

            ImgMod(
                img = img,
                modifier = Modifier.padding(top = 10.dp)
            )
        }



    }
}

@Composable
fun QuizsuggestMod(
    quizsuggest: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = quizsuggest,
        fontSize = 16.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(129.0.dp)
    )
}

@Composable
fun ImgMod(
    img: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = img,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(184.0.dp)
    )
}
