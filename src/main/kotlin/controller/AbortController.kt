package controller

import model.Model

class AbortController(val model: Model) : VisitorController {

    override fun visitAbort() {
        model.presentazione = "Azione non consentita"
    }

}
