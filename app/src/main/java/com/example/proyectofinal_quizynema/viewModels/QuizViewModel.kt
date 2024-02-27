package com.example.proyectofinal_quizynema.viewModels

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectofinal_quizynema.model.QuizModel
import com.example.proyectofinal_quizynema.model.states.QuizState
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * ViewModel responsable de gestionar la lógica y el estado de las notas de los usuarios.
 * Proporciona funciones para agregar, recuperar, actualizar y eliminar notas utilizando Firebase Firestore.
 * Mantiene el estado de la lista de notas y la nota actualmente seleccionada o editada.
 *
 * @property auth Instancia de FirebaseAuth utilizada para obtener el usuario actual.
 * @property firestoreQuiz Instancia de FirebaseFirestore utilizada para operaciones en la base de datos.
 * @property state Estado de la nota actualmente seleccionada o editada.
 * @property title Título de la nota actualmente seleccionada o editada.
 */
class QuizViewModel : ViewModel() {
    // DCS - Definición de variables y funciones para manejar las operaciones sobre las quiz.
    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore

    private val _quizData = MutableStateFlow<List<QuizModel>>(emptyList())
    val quizData: StateFlow<List<QuizModel>> = _quizData

    var state by mutableStateOf(QuizModel())
        private set

    private val _stateFlow = MutableStateFlow<QuizState>(QuizState.Loading)
    val stateFlow: StateFlow<QuizState> = _stateFlow

    private val _quizId = MutableLiveData<String>()
    val quizId: LiveData<String> = _quizId

    private var _allQuizzes: MutableLiveData<ArrayList<QuizModel>> =
        MutableLiveData<ArrayList<QuizModel>>()
    // val allQuizzes: LiveData<ArrayList<QuizModel>> = _allQuizzes

    private var _quizIdsList: MutableLiveData<ArrayList<String>> =
        MutableLiveData<ArrayList<String>>()
    val quizIdsList: LiveData<ArrayList<String>> = _quizIdsList

    var currentList = _quizIdsList.value ?: ArrayList()


    // ---------------------------------------------------------------------------------------- //

    var title by mutableStateOf("")
        private set

    var questionTitle1 by mutableStateOf("")
        private set
    var answer1Question1 by mutableStateOf("")
        private set
    var answer2Question1 by mutableStateOf("")
        private set
    var answer3Question1 by mutableStateOf("")
        private set
    var answer4Question1 by mutableStateOf("")
        private set
    var correctAnswerQuestion1 by mutableStateOf("")
        private set

    var questionTitle2 by mutableStateOf("")
        private set
    var answer1Question2 by mutableStateOf("")
        private set
    var answer2Question2 by mutableStateOf("")
        private set
    var answer3Question2 by mutableStateOf("")
        private set
    var answer4Question2 by mutableStateOf("")
        private set
    var correctAnswerQuestion2 by mutableStateOf("")
        private set

    var questionTitle3 by mutableStateOf("")
        private set
    var answer1Question3 by mutableStateOf("")
        private set
    var answer2Question3 by mutableStateOf("")
        private set
    var answer3Question3 by mutableStateOf("")
        private set
    var answer4Question3 by mutableStateOf("")
        private set
    var correctAnswerQuestion3 by mutableStateOf("")
        private set

    var questionTitle4 by mutableStateOf("")
        private set
    var answer1Question4 by mutableStateOf("")
        private set
    var answer2Question4 by mutableStateOf("")
        private set
    var answer3Question4 by mutableStateOf("")
        private set
    var answer4Question4 by mutableStateOf("")
        private set
    var correctAnswerQuestion4 by mutableStateOf("")
        private set

    var questionTitle5 by mutableStateOf("")
        private set
    var answer1Question5 by mutableStateOf("")
        private set
    var answer2Question5 by mutableStateOf("")
        private set
    var answer3Question5 by mutableStateOf("")
        private set
    var answer4Question5 by mutableStateOf("")
        private set
    var correctAnswerQuestion5 by mutableStateOf("")
        private set


    // ------------------------------------------------------------------------------------- //

    /**
     * This will hear any updates from Firestore
     */
    fun fetchQuiz() {
        firestore.collection("quiz").addSnapshotListener { snapshot, e ->
            // if there is an exception we want to skip.
            if (e != null) {
                Log.w(TAG, "Listen Failed", e)
                return@addSnapshotListener
            }
            // if we are here, we did not encounter an exception
            if (snapshot != null) {
                // now, we have a populated shapshot
                val allQuizs = ArrayList<QuizModel>()
                val documents = snapshot.documents
                currentList = _quizIdsList.value ?: ArrayList()

                documents.forEach {

                    val quiz = it.toObject(QuizModel::class.java)
                    if (quiz != null) {
                        quiz.idQuiz = it.id
                        //Log.d(TAG, quiz.idQuiz)
                        currentList.add(it.id)
                        //fetchQuiz(it.id)
                        allQuizs.add(quiz)
                    }
                }
                _allQuizzes.value = allQuizs // forma para imprimir toda la coleccion
                //Log.d(TAG, allQuizs.toString())
                _quizIdsList.value = currentList

                listenToQuezzys(currentList)

            }
        }

    }


    /**
     * Recupera
     */
    fun listenToQuezzys(documentsId: ArrayList<String>) {
        val documents = mutableListOf<QuizModel>()

        for (i in 0 until documentsId.size){
            firestore.collection("quiz")
                .document(documentsId[i])
                .addSnapshotListener { documentSnapshot, error ->
                    if (error != null) {
                        return@addSnapshotListener
                    }
                    if (documentSnapshot != null) {
                        val document = documentSnapshot.toObject(QuizModel::class.java)?.copy(idQuiz = documentSnapshot.id)
                        if (document != null) {
                            documents.add(document)
                        }
                    }
                    _quizData.value = documents
                }
        }

        //Log.d(TAG, documents.toString())

    }

    /**
     * Recupera todas las notas del usuario actual desde Firestore y actualiza el estado?
     */
    fun getQuizById(documentId: String) {
        firestore.collection("quiz")
            .document(documentId)
            .addSnapshotListener { documentSnapshot, error ->
                if (error != null) {
                    _stateFlow.value = QuizState.Error(error.message ?: "Unknown error")
                    return@addSnapshotListener
                }
                val document = documentSnapshot?.toObject(QuizModel::class.java)?.copy(idQuiz = documentSnapshot.id)
                if (document != null) {
                    _stateFlow.value = QuizState.Success(document)
                } else {
                    _stateFlow.value = QuizState.Error("Document not found")
                }
            }
    }

/*
    /**
     * Recupera los detalles de una nota específica por su ID desde Firestore y actualiza el estado de la nota seleccionada.
     *
     * @param documentId ID del documento de la nota a recuperar.
     */
    fun getQuizById(documentId: String) {
        // DCS - Utiliza la instancia de Firestore para obtener la info de una nota por su id
        firestore.collection("quiz")
            .document(documentId)
            .addSnapshotListener { documentSnapshot, error ->
                if (error != null) {
                    return@addSnapshotListener
                }
                val documents = mutableListOf<QuizModel>()
                if (documentSnapshot != null) {
                    val document = documentSnapshot.toObject(QuizModel::class.java)?.copy(idQuiz = documentSnapshot.id)
                    if (document != null) {
                        documents.add(document)
                    }
                }
                _quizData.value = documents
            }
    }

 */




    /**
     * Actualiza el título de la nota actualmente seleccionada o editada.
     *
     */
    fun changeQuizId(quizId: String) {
        _quizId.value = quizId
    }


    // Método para agregar una nueva pregunta a la colección en Firestore
    fun addNewQuestion(
    ) {
        // Crea una instancia de QuizModel con los datos de la nueva pregunta
        val nuevaPregunta = QuizModel(
            public = true,
            title = title,
            question1 = listOf(
                questionTitle1,
                answer1Question1,
                answer2Question1,
                answer3Question1,
                answer4Question1,
                correctAnswerQuestion1
            ),
            question2 = listOf(
                questionTitle2,
                answer1Question2,
                answer2Question2,
                answer3Question2,
                answer4Question2,
                correctAnswerQuestion2
            ),
            question3 = listOf(
                questionTitle3,
                answer1Question3,
                answer2Question3,
                answer3Question3,
                answer4Question3,
                correctAnswerQuestion3
            ),
            question4 = listOf(
                questionTitle4,
                answer1Question4,
                answer2Question4,
                answer3Question4,
                answer4Question4,
                correctAnswerQuestion4
            ),
            question5 = listOf(
                questionTitle5,
                answer1Question5,
                answer2Question5,
                answer3Question5,
                answer4Question5,
                correctAnswerQuestion5
            ),
            totalCompleted = 0
        )

        // Obtiene una referencia a la colección de preguntas en Firestore
        val collectionRef = FirebaseFirestore.getInstance().collection("quiz")

        // Agrega el nuevo documento a la colección
        collectionRef.add(nuevaPregunta)
            .addOnSuccessListener { documentReference ->
                // El documento se agregó exitosamente, puedes obtener su ID si es necesario
                val nuevoDocumentoId = documentReference.id
                Log.d(TAG, "Nuevo documento agregado con ID: $nuevoDocumentoId")
            }
            .addOnFailureListener { exception ->
                // Maneja cualquier error que ocurra durante la operación
                Log.d(TAG, "Error al agregar nuevo documento: $exception")
            }
    }


    // --------------------------------------------------------------------------------------- //

    /**
     * Actualiza la contraseña del usuario.
     *
     */
    fun createTitle(title: String) {
        this.title = title
    }

    /**
     * Actualiza el nombre de usuario.
     *
     */
    fun createQuestionTitle1(questionTitle1: String) {
        this.questionTitle1 = questionTitle1
    }

    fun createAnswer1Question1(answer1Question1: String) {
        this.answer1Question1 = answer1Question1
    }

    fun createAnswer2Question1(answer2Question1: String) {
        this.answer2Question1 = answer2Question1
    }

    fun createAnswer3Question1(answer3Question1: String) {
        this.answer3Question1 = answer3Question1
    }

    fun createAnswer4Question1(answer4Question1: String) {
        this.answer4Question1 = answer4Question1
    }

    fun createCorrectAnswerQuestion1(correctAnswerQuestion1: String) {
        this.correctAnswerQuestion1 = correctAnswerQuestion1
    }

    /**
     * Actualiza el nombre de usuario.
     *
     */
    fun createQuestionTitle2(questionTitle2: String) {
        this.questionTitle2 = questionTitle2
    }

    fun createAnswer1Question2(answer1Question2: String) {
        this.answer1Question2 = answer1Question2
    }

    fun createAnswer2Question2(answer2Question2: String) {
        this.answer2Question2 = answer2Question2
    }

    fun createAnswer3Question2(answer3Question2: String) {
        this.answer3Question2 = answer3Question2
    }

    fun createAnswer4Question2(answer4Question2: String) {
        this.answer4Question2 = answer4Question2
    }

    fun createCorrectAnswerQuestion2(correctAnswerQuestion2: String) {
        this.correctAnswerQuestion2 = correctAnswerQuestion2
    }

    /**
     * Actualiza el nombre de usuario.
     *
     */
    fun createQuestionTitle3(questionTitle3: String) {
        this.questionTitle3 = questionTitle3
    }

    fun createAnswer1Question3(answer1Question3: String) {
        this.answer1Question3 = answer1Question3
    }

    fun createAnswer2Question3(answer2Question3: String) {
        this.answer2Question3 = answer2Question3
    }

    fun createAnswer3Question3(answer3Question3: String) {
        this.answer3Question3 = answer3Question3
    }

    fun createAnswer4Question3(answer4Question3: String) {
        this.answer4Question3 = answer4Question3
    }

    fun createCorrectAnswerQuestion3(correctAnswerQuestion3: String) {
        this.correctAnswerQuestion3 = correctAnswerQuestion3
    }

    /**
     * Actualiza el nombre de usuario.
     *
     */
    fun createQuestionTitle4(questionTitle4: String) {
        this.questionTitle4 = questionTitle4
    }

    fun createAnswer1Question4(answer1Question4: String) {
        this.answer1Question4 = answer1Question4
    }

    fun createAnswer2Question4(answer2Question4: String) {
        this.answer2Question4 = answer2Question4
    }

    fun createAnswer3Question4(answer3Question4: String) {
        this.answer3Question4 = answer3Question4
    }

    fun createAnswer4Question4(answer4Question4: String) {
        this.answer4Question4 = answer4Question4
    }

    fun createCorrectAnswerQuestion4(correctAnswerQuestion4: String) {
        this.correctAnswerQuestion4 = correctAnswerQuestion4
    }

    /**
     * Actualiza el nombre de usuario.
     *
     */
    fun createQuestionTitle5(questionTitle5: String) {
        this.questionTitle5 = questionTitle5
    }

    fun createAnswer1Question5(answer1Question5: String) {
        this.answer1Question5 = answer1Question5
    }

    fun createAnswer2Question5(answer2Question5: String) {
        this.answer2Question5 = answer2Question5
    }

    fun createAnswer3Question5(answer3Question5: String) {
        this.answer3Question5 = answer3Question5
    }

    fun createAnswer4Question5(answer4Question5: String) {
        this.answer4Question5 = answer4Question5
    }

    fun createCorrectAnswerQuestion5(correctAnswerQuestion5: String) {
        this.correctAnswerQuestion5 = correctAnswerQuestion5
    }

}