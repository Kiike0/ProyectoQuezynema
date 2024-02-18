package com.example.proyectofinal_quizynema.viewModels

import com.example.proyectofinal_quizynema.model.QuizModel

sealed class QuizState {
    object Loading : QuizState()
    data class Success(val quiz: QuizModel) : QuizState()
    data class Error(val message: String) : QuizState()
}