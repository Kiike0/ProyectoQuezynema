package com.example.proyectofinal_quizynema.model

/**
 * Define el modelo de datos para las preguntas.
 * Se utiliza para gestionar las preguntas de las quiz en la base de datos.
 */
data class QuizModel(
    val idQuiz: String = "",
    val title: String = "",
    val question1: List<String>? = null,
    val question2: List<String>? = null,
    val question3: List<String>? = null,
    val question4: List<String>? = null
)
