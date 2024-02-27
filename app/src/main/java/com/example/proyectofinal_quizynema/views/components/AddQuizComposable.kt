package com.example.proyectofinal_quizynema.views.components

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.proyectofinal_quizynema.navegacion.Navegacion
import com.example.proyectofinal_quizynema.navigation.Routes
import com.example.proyectofinal_quizynema.ui.theme.BackGroundAccessBox
import com.example.proyectofinal_quizynema.ui.theme.BackGroundApp
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
            item {
                // Texto editable para el Email
                OutlinedTextField(
                    value = quizVM.title,
                    onValueChange = { quizVM.createTitle(it) },
                    label = { CustomizedText(customizedText = "Titulo") },
                    modifier = Modifier
                        .padding(top = 70.dp)
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
                // Texto editable para el Nombre de usuario
                OutlinedTextField(
                    value = quizVM.questionTitle1,
                    onValueChange = { quizVM.createQuestionTitle1(it) },
                    label = { CustomizedText(customizedText = "Titulo Q1") },
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
                // Texto editable para la Contraseña
                OutlinedTextField(
                    value = quizVM.answer1Question1,
                    onValueChange = { quizVM.createAnswer1Question1(it) },
                    label = { CustomizedText(customizedText = "Answer1Q1") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer2Question1,
                    onValueChange = { quizVM.createAnswer2Question1(it) },
                    label = { CustomizedText(customizedText = "Answer2Q1") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer3Question1,
                    onValueChange = { quizVM.createAnswer3Question1(it) },
                    label = { CustomizedText(customizedText = "Answer3Q1") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer4Question1,
                    onValueChange = { quizVM.createAnswer4Question1(it) },
                    label = { CustomizedText(customizedText = "Answer4Q1") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion1,
                    onValueChange = { quizVM.createCorrectAnswerQuestion1(it) },
                    label = { CustomizedText(customizedText = "CorrectAnswerQ1") },
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
                // Texto editable para el Nombre de usuario
                OutlinedTextField(
                    value = quizVM.questionTitle2,
                    onValueChange = { quizVM.createQuestionTitle2(it) },
                    label = { CustomizedText(customizedText = "Titulo Q2") },
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
                // Texto editable para la Contraseña
                OutlinedTextField(
                    value = quizVM.answer1Question2,
                    onValueChange = { quizVM.createAnswer1Question2(it) },
                    label = { CustomizedText(customizedText = "Answer1Q2") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer2Question2,
                    onValueChange = { quizVM.createAnswer2Question2(it) },
                    label = { CustomizedText(customizedText = "Answer2Q2") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer3Question2,
                    onValueChange = { quizVM.createAnswer3Question2(it) },
                    label = { CustomizedText(customizedText = "Answer3Q2") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer4Question2,
                    onValueChange = { quizVM.createAnswer4Question2(it) },
                    label = { CustomizedText(customizedText = "Answer4Q2") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion2,
                    onValueChange = { quizVM.createCorrectAnswerQuestion2(it) },
                    label = { CustomizedText(customizedText = "CorrectAnswerQ2") },
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
                // Texto editable para el Nombre de usuario
                OutlinedTextField(
                    value = quizVM.questionTitle3,
                    onValueChange = { quizVM.createQuestionTitle3(it) },
                    label = { CustomizedText(customizedText = "Titulo Q3") },
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
                // Texto editable para la Contraseña
                OutlinedTextField(
                    value = quizVM.answer1Question3,
                    onValueChange = { quizVM.createAnswer1Question3(it) },
                    label = { CustomizedText(customizedText = "Answer1Q3") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer2Question3,
                    onValueChange = { quizVM.createAnswer2Question3(it) },
                    label = { CustomizedText(customizedText = "Answer2Q3") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer3Question3,
                    onValueChange = { quizVM.createAnswer3Question3(it) },
                    label = { CustomizedText(customizedText = "Answer3Q3") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer4Question3,
                    onValueChange = { quizVM.createAnswer4Question3(it) },
                    label = { CustomizedText(customizedText = "Answer4Q3") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion3,
                    onValueChange = { quizVM.createCorrectAnswerQuestion3(it) },
                    label = { CustomizedText(customizedText = "CorrectAnswerQ3") },
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
                // Texto editable para el Nombre de usuario
                OutlinedTextField(
                    value = quizVM.questionTitle4,
                    onValueChange = { quizVM.createQuestionTitle4(it) },
                    label = { CustomizedText(customizedText = "Titulo Q4") },
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
                // Texto editable para la Contraseña
                OutlinedTextField(
                    value = quizVM.answer1Question4,
                    onValueChange = { quizVM.createAnswer1Question4(it) },
                    label = { CustomizedText(customizedText = "Answer1Q4") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer2Question4,
                    onValueChange = { quizVM.createAnswer2Question4(it) },
                    label = { CustomizedText(customizedText = "Answer2Q4") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer3Question4,
                    onValueChange = { quizVM.createAnswer3Question4(it) },
                    label = { CustomizedText(customizedText = "Answer3Q4") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer4Question4,
                    onValueChange = { quizVM.createAnswer4Question4(it) },
                    label = { CustomizedText(customizedText = "Answer4Q4") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion4,
                    onValueChange = { quizVM.createCorrectAnswerQuestion4(it) },
                    label = { CustomizedText(customizedText = "CorrectAnswerQ4") },
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
                // Texto editable para el Nombre de usuario
                OutlinedTextField(
                    value = quizVM.questionTitle5,
                    onValueChange = { quizVM.createQuestionTitle5(it) },
                    label = { CustomizedText(customizedText = "Titulo Q5") },
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
                // Texto editable para la Contraseña
                OutlinedTextField(
                    value = quizVM.answer1Question5,
                    onValueChange = { quizVM.createAnswer1Question5(it) },
                    label = { CustomizedText(customizedText = "Answer1Q5") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer2Question5,
                    onValueChange = { quizVM.createAnswer2Question5(it) },
                    label = { CustomizedText(customizedText = "Answer2Q5") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer3Question5,
                    onValueChange = { quizVM.createAnswer3Question5(it) },
                    label = { CustomizedText(customizedText = "Answer3Q5") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.answer4Question5,
                    onValueChange = { quizVM.createAnswer4Question5(it) },
                    label = { CustomizedText(customizedText = "Answer4Q5") },
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
                // Texto editable para comprobar si la contraseña es la misma
                OutlinedTextField(
                    value = quizVM.correctAnswerQuestion5,
                    onValueChange = { quizVM.createCorrectAnswerQuestion5(it) },
                    label = { CustomizedText(customizedText = "CorrectAnswerQ5") },
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
                // Ubicación y estilo del botón Crear cuenta
                AddQuizButton(
                    onClickButton = {
                        quizVM.addNewQuestion()
                        navController.navigate(Routes.HomeScreen.route)
                    }
                )
            }
        }
    }
}


@Composable
fun AddQuizButton(
    onClickButton: () -> Unit
) {
    Button(
        onClick = onClickButton,
        modifier = Modifier
            .size(width = 230.dp, height = 60.dp)
            .padding(top = 20.dp),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BackGroundAccessBox,
            contentColor = Color.White
        )
    ) {
        Text(text = "Crear Quiz")
    }
}
