package com.example.proyectofinal_quizynema.views

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.dialog.Alert
import com.example.proyectofinal_quizynema.viewModels.UserViewModel

/**
 * Vista composable para el registro de nuevos usuarios. Permite al usuario crear una nueva cuenta
 * introduciendo un nombre de usuario, correo electrónico y contraseña.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterView(newUser: UserViewModel) {
    // DCS - Estructura de la interfaz de registro con campos de texto y botón de registro.

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        OutlinedTextField(
            value = newUser.nickname,
            onValueChange = { newUser.changeUserName(it) },
            label = { Text(text = "Nickname") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        OutlinedTextField(
            value = newUser.email,
            onValueChange = { newUser.changeEmail(it) },
            label = { Text(text = "Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        OutlinedTextField(
            value = newUser.password,
            onValueChange = { newUser.changePassword(it) },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        OutlinedTextField(
            value = newUser.favoriteFilm,
            onValueChange = { newUser.changeFavoriteFilm(it) },
            label = { Text(text = "Favorite Film") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                newUser.createUser {
                    //navController.navigate("Home")
                }
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Registrarse")
        }

        if (newUser.showAlert) {
            Text(text = "Usuario creado mal")
        }

    }
}