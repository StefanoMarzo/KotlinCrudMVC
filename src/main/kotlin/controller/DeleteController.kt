package controller

import messages.DeleteMessage
import messages.Message
import model.Model

class DeleteController(val model: Model, val message: Message) : VisitorController {


    override fun visitDelete() {
        val id = (message as DeleteMessage).id

        model.presentazione = if(model.personList.remove(id))
            "Rimossa persona con id $id" else "Nessuna persona da rimuovere trovata"
    }


}
