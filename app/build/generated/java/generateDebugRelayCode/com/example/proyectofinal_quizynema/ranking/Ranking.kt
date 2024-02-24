package com.example.proyectofinal_quizynema.ranking

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectofinal_quizynema.R
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'ranking'.
 * Generated code; do not edit directly
 */
@Composable
fun Ranking(
    modifier: Modifier = Modifier,
    goldMedal: Painter = EmptyPainter(),
    silverMedal: Painter = EmptyPainter(),
    bronzeMedal: Painter = EmptyPainter(),
    firstUserName: String = "",
    firstPointsText: String = "",
    secondUserName: String = "",
    secondPointsText: AnnotatedString = AnnotatedString(""),
    thirdUserName: String = "",
    thirtPointsText: String = "",
    fourthUserName: String = "",
    fourthPointsText: String = "",
    textRankingTitle: String = ""
) {
    TopLevel(modifier = modifier) {
        RankingBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 3.5.dp
                )
            )
        )
        FirstRectangle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -97.5.dp
                )
            )
        )
        SecondRectangle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -9.5.dp
                )
            )
        )
        ThirdRectangle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 79.5.dp
                )
            )
        )
        FourthRectangle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 162.5.dp
                )
            )
        )
        GoldMedal(
            goldMedal = goldMedal,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -137.54505825042725.dp,
                    y = -97.85478210449219.dp
                )
            )
        )
        SilverMedal(
            silverMedal = silverMedal,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -137.54505825042725.dp,
                    y = -7.8547821044921875.dp
                )
            )
        )
        BronzeMedal(
            bronzeMedal = bronzeMedal,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -137.94032192230225.dp,
                    y = 82.36433410644531.dp
                )
            )
        )
        FirstUserName(
            firstUserName = firstUserName,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -35.5.dp,
                    y = -89.5.dp
                )
            )
        )
        FirstPointsText(
            firstPointsText = firstPointsText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 98.4651870727539.dp,
                    y = -90.45214080810547.dp
                )
            )
        )
        SecondUserName(
            secondUserName = secondUserName,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -37.292152404785156.dp,
                    y = -5.323478698730469.dp
                )
            )
        )
        SecondPointsText(
            secondPointsText = secondPointsText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 98.4651870727539.dp,
                    y = -6.246940612792969.dp
                )
            )
        )
        ThirdUserName(
            thirdUserName = thirdUserName,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -37.292152404785156.dp,
                    y = 83.67652130126953.dp
                )
            )
        )
        ThirtPointsText(
            thirtPointsText = thirtPointsText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 97.03059005737305.dp,
                    y = 83.83301544189453.dp
                )
            )
        )
        FourthUserName(
            fourthUserName = fourthUserName,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -40.16133117675781.dp,
                    y = 167.67652130126953.dp
                )
            )
        )
        FourthPointsText(
            fourthPointsText = fourthPointsText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 97.03059005737305.dp,
                    y = 168.03821563720703.dp
                )
            )
        )
        TextRankingTitle(
            textRankingTitle = textRankingTitle,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -6.5.dp,
                    y = -168.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 393, heightDp = 403)
@Composable
private fun RankingPreview() {
    MaterialTheme {
        RelayContainer {
            Ranking(
                goldMedal = painterResource(R.drawable.ranking_gold_medal),
                silverMedal = painterResource(R.drawable.ranking_silver_medal),
                bronzeMedal = painterResource(R.drawable.ranking_bronze_medal),
                firstUserName = "Joker1231",
                firstPointsText = "30 Puntos",
                secondUserName = "Asoka888",
                secondPointsText = buildAnnotatedString {
                    append("28 ")
                    withStyle(
                        style = SpanStyle(
                            color = Color(
                                alpha = 255,
                                red = 255,
                                green = 255,
                                blue = 255
                            ),
                            fontSize = 15.0.sp
                        )
                    ) {
                        append("Puntos")
                    }
                },
                thirdUserName = "JohnWayne8",
                thirtPointsText = "21 Puntos",
                fourthUserName = "Fox523",
                fourthPointsText = "15 Puntos",
                textRankingTitle = "Ranking Mundial",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RankingBox(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_ranking_box),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(396.0.dp)
    )
}

@Composable
fun FirstRectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_first_rectangle),
        modifier = modifier.requiredWidth(342.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun SecondRectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_second_rectangle),
        modifier = modifier.requiredWidth(342.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun ThirdRectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_third_rectangle),
        modifier = modifier.requiredWidth(342.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun FourthRectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_fourth_rectangle),
        modifier = modifier.requiredWidth(342.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun GoldMedal(
    goldMedal: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = goldMedal,
        radius = 70.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(23.909883499145508.dp).requiredHeight(33.290435791015625.dp)
    )
}

@Composable
fun SilverMedal(
    silverMedal: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = silverMedal,
        radius = 70.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(23.909883499145508.dp).requiredHeight(33.290435791015625.dp)
    )
}

@Composable
fun BronzeMedal(
    bronzeMedal: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = bronzeMedal,
        radius = 70.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(23.909883499145508.dp).requiredHeight(33.290435791015625.dp)
    )
}

@Composable
fun FirstUserName(
    firstUserName: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = firstUserName,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(148.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun FirstPointsText(
    firstPointsText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = firstPointsText,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(84.16279602050781.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun SecondUserName(
    secondUserName: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = secondUserName,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(144.4156951904297.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun SecondPointsText(
    secondPointsText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = secondPointsText,
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
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(84.16279602050781.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun ThirdUserName(
    thirdUserName: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = thirdUserName,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(144.4156951904297.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun ThirtPointsText(
    thirtPointsText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = thirtPointsText,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(81.2936019897461.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun FourthUserName(
    fourthUserName: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fourthUserName,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(138.67733764648438.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun FourthPointsText(
    fourthPointsText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fourthPointsText,
        fontSize = 15.0.sp,
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
        maxLines = -1,
        modifier = modifier.requiredWidth(81.2936019897461.dp).requiredHeight(30.353042602539062.dp)
    )
}

@Composable
fun TextRankingTitle(
    textRankingTitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textRankingTitle,
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
