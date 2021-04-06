package controller

import messages.Message
import messages.ReadMessage
import model.Model
import utilities.Observable
import utilities.Observer
import view.CommandLineView

class ActionController(var model: Model): Observer {

    var message: Message = ReadMessage()


    fun control() {
        message.visit(
            CreateController(model, message),
            ReadController(model, message),
            DeleteController(model, message),
            UpdateController(model, message),
            ExitController(),
            AbortController(model)
        )
    }

    override fun update(observable: Observable) {
        message = (observable as CommandLineView).message
        control()
        model.notificaGliInteressati()
    }

}