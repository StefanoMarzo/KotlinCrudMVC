package messages

import controller.VisitorController

class ReadMessage: Message() {
    override fun visit(vc: VisitorController) = vc.visitRead()
}
