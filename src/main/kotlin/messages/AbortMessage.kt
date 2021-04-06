package messages

import controller.VisitorController

class AbortMessage : Message() {
    override fun visit(vc: VisitorController) {
        vc.visitAbort()
    }

}
