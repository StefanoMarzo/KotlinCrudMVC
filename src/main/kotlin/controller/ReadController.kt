package controller

import messages.Message
import model.Model

class ReadController(val model: Model, val message: Message) : VisitorController {

    override fun visitRead() {
        model.presentazione = model.getListaPersone()
    }

}
