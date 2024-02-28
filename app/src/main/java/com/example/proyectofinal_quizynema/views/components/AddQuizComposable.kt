package com.example.proyectofinal_quizynema.views.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
import com.example.proyectofinal_quizynema.ui.theme.BackGroundCard
import com.example.proyectofinal_quizynema.ui.theme.BackGroundOutlinedAnswer
import com.example.proyectofinal_quizynema.ui.theme.BackGroundOutlinedQuestion
import com.example.proyectofinal_quizynema.viewModels.QuizViewModel

/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddQuizComposable(
    quizVM: QuizViewModel,
    navController: NavHostController
) {

    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp)
    ) {
        // Navegación con el titulo de la pantalla para poder volver atrás
        Navegacion(
            modifier = Modifier
                .size(300.dp, 120.dp)
                .align(Alignment.Start),
            textNav = "Crear Quiz",
            onBack = { navController.navigate(Routes.HomeScreen.route) }
        )
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(BackGroundApp)
        ) {
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Título de la quiz",
                    modifier = Modifier
                )
            }
            item{
                // Texto editable para el titulo de la quiz
                OutlinedTextField(
                    value = quizVM.title,
                    onValueChange = { quizVM.createTitle(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundCard)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )
            }
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Pregunta 1:",
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
            item {
                // Texto editable para el título de la pregunta
                OutlinedTextField(
                    value = quizVM.questionTitle1,
                    onValueChange = { quizVM.createQuestionTitle1(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo de la pregunta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedQuestion)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {
                // Texto editable para las opciones de la pregunta
                OutlinedTextField(
                    value = quizVM.answer1Question1,
                    onValueChange = { quizVM.createAnswer1Question1(it) },
                    label = { CustomizedText(customizedText = "Opción 1") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer2Question1,
                    onValueChange = { quizVM.createAnswer2Question1(it) },
                    label = { CustomizedText(customizedText = "Opción 2") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer3Question1,
                    onValueChange = { quizVM.createAnswer3Question1(it) },
                    label = { CustomizedText(customizedText = "Opción 3") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer4Question1,
                    onValueChange = { quizVM.createAnswer4Question1(it) },
                    label = { CustomizedText(customizedText = "Opción 4") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion1,
                    onValueChange = { quizVM.createCorrectAnswerQuestion1(it) },
                    label = { CustomizedSimpleTextBlack(customizedText = "Respuesta correcta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedAnswer)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.Black)
                )

            }
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Pregunta 2:",
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
            item {

                OutlinedTextField(
                    value = quizVM.questionTitle2,
                    onValueChange = { quizVM.createQuestionTitle2(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo de la pregunta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedQuestion)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer1Question2,
                    onValueChange = { quizVM.createAnswer1Question2(it) },
                    label = { CustomizedText(customizedText = "Opción 1") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer2Question2,
                    onValueChange = { quizVM.createAnswer2Question2(it) },
                    label = { CustomizedText(customizedText = "Opción 2") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer3Question2,
                    onValueChange = { quizVM.createAnswer3Question2(it) },
                    label = { CustomizedText(customizedText = "Opción 3") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer4Question2,
                    onValueChange = { quizVM.createAnswer4Question2(it) },
                    label = { CustomizedText(customizedText = "Opción 4") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion2,
                    onValueChange = { quizVM.createCorrectAnswerQuestion2(it) },
                    label = { CustomizedSimpleTextBlack(customizedText = "Respuesta correcta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedAnswer)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.Black)
                )

            }
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Pregunta 3:",
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
            item {

                OutlinedTextField(
                    value = quizVM.questionTitle3,
                    onValueChange = { quizVM.createQuestionTitle3(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo de la pregunta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedQuestion)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer1Question3,
                    onValueChange = { quizVM.createAnswer1Question3(it) },
                    label = { CustomizedText(customizedText = "Opción 1") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer2Question3,
                    onValueChange = { quizVM.createAnswer2Question3(it) },
                    label = { CustomizedText(customizedText = "Opción 2") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer3Question3,
                    onValueChange = { quizVM.createAnswer3Question3(it) },
                    label = { CustomizedText(customizedText = "Opción 3") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer4Question3,
                    onValueChange = { quizVM.createAnswer4Question3(it) },
                    label = { CustomizedText(customizedText = "Opción 4") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion3,
                    onValueChange = { quizVM.createCorrectAnswerQuestion3(it) },
                    label = { CustomizedSimpleTextBlack(customizedText = "Respuesta correcta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedAnswer)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.Black)
                )

            }
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Pregunta 4:",
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
            item {

                OutlinedTextField(
                    value = quizVM.questionTitle4,
                    onValueChange = { quizVM.createQuestionTitle4(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo de la pregunta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedQuestion)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer1Question4,
                    onValueChange = { quizVM.createAnswer1Question4(it) },
                    label = { CustomizedText(customizedText = "Opción 1") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer2Question4,
                    onValueChange = { quizVM.createAnswer2Question4(it) },
                    label = { CustomizedText(customizedText = "Opción 2") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer3Question4,
                    onValueChange = { quizVM.createAnswer3Question4(it) },
                    label = { CustomizedText(customizedText = "Opción 3") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer4Question4,
                    onValueChange = { quizVM.createAnswer4Question4(it) },
                    label = { CustomizedText(customizedText = "Opción 4") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion4,
                    onValueChange = { quizVM.createCorrectAnswerQuestion4(it) },
                    label = { CustomizedSimpleTextBlack(customizedText = "Respuesta correcta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedAnswer)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.Black)
                )

            }
            item{
                CustomizedBiggerTextBold(
                    customizedText = "Pregunta 5:",
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
            item {

                OutlinedTextField(
                    value = quizVM.questionTitle5,
                    onValueChange = { quizVM.createQuestionTitle5(it) },
                    label = { CustomizedSimpleText(customizedText = "Titulo de la pregunta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedQuestion)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer1Question5,
                    onValueChange = { quizVM.createAnswer1Question5(it) },
                    label = { CustomizedText(customizedText = "Opción 1") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer2Question5,
                    onValueChange = { quizVM.createAnswer2Question5(it) },
                    label = { CustomizedText(customizedText = "Opción 2") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer3Question5,
                    onValueChange = { quizVM.createAnswer3Question5(it) },
                    label = { CustomizedText(customizedText = "Opción 3") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.answer4Question5,
                    onValueChange = { quizVM.createAnswer4Question5(it) },
                    label = { CustomizedText(customizedText = "Opción 4") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundAccessBox)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.White)
                )

            }
            item {

                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion5,
                    onValueChange = { quizVM.createCorrectAnswerQuestion5(it) },
                    label = { CustomizedSimpleTextBlack(customizedText = "Respuesta correcta") },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(BackGroundOutlinedAnswer)
                        .width(350.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    textStyle = LocalTextStyle.current.copy(color = Color.Black)
                )

            }
            item {
                CustomizedButton(
                    onCreateButton = {
                        quizVM.addNewQuestion()
                        navController.navigate(Routes.HomeScreen.route)
                    },
                    modifier = Modifier
                )
            }
        }
    }
}
