package messages

import controller.VisitorController
import model.Persona

class CreateMessage(var persona: Persona): Message() {
    override fun visit(vc: VisitorController) = vc.visitCreate()
}
