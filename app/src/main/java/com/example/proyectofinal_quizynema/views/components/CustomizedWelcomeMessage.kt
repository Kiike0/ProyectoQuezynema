package com.example.proyectofinal_quizynema.views.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.example.proyectofinal_quizynema.welcomemsj.tomorrow
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'welcome_msj'.
 * Generated code; do not edit directly
 */
@Composable
fun CustomizedWelcomeMessage(
    greetings: String = "",
    letsQuiz: String = "",
    avatarImg: () -> Unit = {}
) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 30.dp)
    ) {
        Row(){
            Column {
                CustomizedGreetings(
                    greetings = greetings,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.height(10.dp))
                CustomizedLetsQuiz(
                    letsQuiz = letsQuiz,
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.width(55.dp))
            CustomizedAvatarImg(
                avatarImg = avatarImg,
                modifier = Modifier
            )
        }


    }
}

@Composable
fun CustomizedGreetings(
    greetings: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = greetings,
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

@Composable
fun CustomizedLetsQuiz(
    letsQuiz: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = letsQuiz,
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
fun CustomizedAvatarImg(
    avatarImg: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.welcome_msj_avatar_img),
        radius = 30.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .tappable(onTap = avatarImg)
            .requiredWidth(60.0.dp) // Aquí cambias el ancho
            .requiredHeight(60.0.dp) // Aquí cambias el alto
    )
}