package view

import constants.Actions
import messages.AbortMessage
import messages.Message
import messages.ReadMessage
import model.Model
import utilities.Observable
import utilities.Observer
import java.lang.Exception
import java.lang.IndexOutOfBoundsException
import java.util.*

class CommandLineView: View, Observer, Observable() {

    var output = ""
    var message: Message = ReadMessage()
        private set(value) {
            field = value
            notificaGliInteressati()
        }

    override fun getInput() {
        println("Inserire un comando:")
        getOptions()
        try{
            val numeroInserito = Scanner(System.`in`).nextInt()
            message = Actions.READ.getOne(numeroInserito).executeCommand()
        }
        catch (e: Exception) {
            when(e) {
                is IndexOutOfBoundsException,
                is InputMismatchException -> message = AbortMessage()
            }
        }

    }

    override fun printOutput() = println(output)


    override fun getOptions() {
        for(a in Actions.values()) println("${a.commandNumber}] ${a.commandString}")
    }

    override fun update(observable: Observable) {
        output = (observable as Model).presentazione
    }

}