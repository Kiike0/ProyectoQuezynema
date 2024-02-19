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
    object InitialScreen : Routes("initialScreen")

    /**
     * Objeto que representa la pantalla de Inicio de Sesión (Acceso).
     */
    object AccessScreen : Routes("accessScreen")

    /**
     * Objeto que representa la pantalla de Registro de usuario.
     */
    object RegisterScreen : Routes("registerScreen")

    /**
     * Objeto que representa la pantalla con las opciones del Juego.
     */
    object GamesScreen : Routes("gamesScreen")

    /**
     * Objeto que representa la pantalla de las preguntas.
     */
    object QuestionScreen : Routes("questionScreen")


    /**
     * Objeto que representa la pantalla del usuario.
     */
    object UserScreen : Routes("userScreen")

    /**
     * Objeto que representa la pantalla de Quiz disponibles.
     */
    object AvailableQuizsScreen : Routes("availablequizsScreen")
}