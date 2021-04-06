package controller

import messages.CreateMessage
import messages.Message
import model.Model

class CreateController(val model: Model,val message: Message) : VisitorController {

    override fun visitCreate() {
        val persona = (message as CreateMessage).persona
        model.personList.add(persona)
        model.presentazione = "Aggiunta nuova persona: $persona"
    }

}
