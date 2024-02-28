package com.example.proyectofinal_quizynema.model.states

import com.example.proyectofinal_quizynema.model.QuizModel

/**
 * Una clase sellada que encuentra los estados en la base de datos
 * Utilizada para acceder a las preguntas de las quiz
 *
 */
sealed class QuizState {
    object Loading : QuizState()
    data class Success(val quiz: QuizModel) : QuizState()
    data class Error(val message: String) : QuizState()
}