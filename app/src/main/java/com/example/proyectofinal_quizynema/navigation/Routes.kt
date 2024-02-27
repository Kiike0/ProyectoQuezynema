package com.example.proyectofinal_quizynema.navigation

/**
 * Clase sellada que representa las diferentes pantallas de la aplicación.
 *
 * @property route El identificador de la ruta
 */
sealed class Routes(val route: String) {
    /**
     * Objeto que representa la pantalla Inicial.
     */
    object StartGameScreen : Routes("startGameScreen")
    /**
     * Objeto que representa la pantalla Inicial.
     */
    object EmptyScreen : Routes("emptyScreen")

    /**
     * Objeto que representa la pantalla de Inicio de Sesión (Acceso).
     */
    object AccessScreen : Routes("accessScreen")

    /**
     * Objeto que representa la pantalla de Registro de usuario.
     */
    object RegisterScreen : Routes("registerScreen")

    /**
     * Objeto que representa la pantalla Home con las opciones del Juego.
     */
    object HomeScreen : Routes("homeScreen")


    /**
     * Objeto que representa la pantalla Home con las opciones del Juego.
     */
    object AddQuizScreen : Routes("addQuizScreen")






    /**
     * Objeto que representa la pantalla del usuario.
     */
    object UserScreen : Routes("userScreen")

    /**
     * Objeto que representa la pantalla de las preguntas.
     */
    object QuizScreen : Routes("quizScreen")

    /**
     * Objeto que representa la pantalla de las preguntas.
     */
    object Question1Screen : Routes("question1Screen")


    /**
     * Objeto que representa la pantalla de Quiz disponibles.
     */
    object AllQuizzesScreen : Routes("allQuizzesScreen")
}