package messages

import controller.VisitorController
import model.Persona

class UpdateMessage(val persona: Persona) : Message() {
    override fun visit(vc: VisitorController) {
        vc.visitUpdate()
    }

}
