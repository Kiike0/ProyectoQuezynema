# Pasos para la creación y dificultades

Las primeras pantallas de la Aplicación son las de Iniciar Juego y acceso o registro a la aplicación, para acceder deberás crear una cuenta nueva si no tienes una ya creada.

La pantalla del usuario son las que él o ella interactúa con las opciones de la aplicación. Muestra el mensaje de bienvenida con el nick del usuario que se loguea. La tarjeta correrá una quiz al azar disponible, para empezar el test con mayor rapidez. Las quiz populares, muestran las más importantes quiz que se han hecho y luego un par de quiz sugeridas, para que el usuario pueda acceder a ellas.

La barra de navegación funciona de la siguiente manera en este orden: Pantalla home, Añadir quiz, Ver las quiz disponibles y Cerrar Sesion.

Las Quiz disponibles mostrará las quiz que se han creado por el usuario. Muestra dos quiz por fila, para que no haya problemas en la aplicación hemos calculado si el tamaño de la lista de todas las quiz es impar o par y así en vez de una fila de dos quiz al final mostrará solo una.

Para crear una quiz añadiremos el título de la quiz, las preguntas (hasta 5), las opciones y la respuesta correcta. Todo esto se guardará en la colección creada en Firebase.

La pantalla del Juego y las preguntas del Quiz, se muestran en dos únicas pantallas, una para mostrar el título y otra las preguntas. En las preguntas se va actualizando las preguntas a medida que elegimos las opciones. Al final te suma todas las preguntas correctas y te las muestras en un mensaje.
