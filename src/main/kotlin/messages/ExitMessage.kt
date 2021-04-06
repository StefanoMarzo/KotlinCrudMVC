package messages

import controller.VisitorController

class ExitMessage : Message() {
    override fun visit(vc: VisitorController) {
        vc.visitExit()
    }

}
