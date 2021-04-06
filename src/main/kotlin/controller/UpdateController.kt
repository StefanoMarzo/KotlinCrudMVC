package controller

import messages.Message
import messages.UpdateMessage
import model.Model

class UpdateController(val model: Model,val message: Message) : VisitorController {

    override fun visitUpdate() {
        model.personList.update((message as UpdateMessage).persona)
        model.presentazione = "Aggiornata persona."
    }

}
