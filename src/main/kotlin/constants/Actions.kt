package constants

import messages.*
import model.Persona
import java.util.*

enum class Actions(val commandNumber: Int, val commandString: String) {
    CREATE(1, "Crea nuova persona") {
        override fun executeCommand(): CreateMessage {
            println("Inserire nome: ")
            val nome = Scanner(System.`in`).nextLine()
            println("Inserire cognome: ")
            val cognome = Scanner(System.`in`).nextLine()
            return CreateMessage(Persona(0, nome, cognome))
        }
    },
    READ(2, "Leggi registro di persone") {
        override fun executeCommand(): ReadMessage {
            return ReadMessage()
        }
    },
    DELETE(3, "Cancella una persona") {
        override fun executeCommand(): Message {
            println("Inserire ID:")
            val id = Scanner(System.`in`).nextInt()
            return DeleteMessage(id)
        }
    },
    UPDATE(4, "Modifica Persona"){
        override fun executeCommand(): Message {
            println("Inserire ID:")
            val id = Scanner(System.`in`).nextInt()
            println("Inserire nome: ")
            val nome = Scanner(System.`in`).nextLine()
            println("Inserire cognome: ")
            val cognome = Scanner(System.`in`).nextLine()
            return UpdateMessage(Persona(id, nome, cognome))
        }

    },

    EXIT(0, "Esci"){
        override fun executeCommand(): Message {
            return ExitMessage()
        }

    }
    ;

    abstract fun executeCommand(): Message

    fun getOne(num: Int) = values().filter { it.commandNumber == num }[0]

}