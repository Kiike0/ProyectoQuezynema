package com.example.proyectofinal_quizynema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectofinal_quizynema.ui.theme.Proyectofinal_quizynemaTheme
import com.example.proyectofinal_quizynema.viewModels.UserViewModel
import com.example.proyectofinal_quizynema.viewModels.ViewModelPrueba
import com.example.proyectofinal_quizynema.views.InicioSesion
import com.example.proyectofinal_quizynema.views.PantallaInicial
import com.example.proyectofinal_quizynema.views.QuizScreen
import com.example.proyectofinal_quizynema.views.RegisterView
import com.example.proyectofinal_quizynema.views.Registro

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyectofinal_quizynemaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //QuizScreen(quizVM = ViewModelPrueba())
                    //RegisterView(newUser = UserViewModel())
                    //PantallaInicial()
                    //InicioSesion()
                    Registro()
                }
            }
        }
    }
}
