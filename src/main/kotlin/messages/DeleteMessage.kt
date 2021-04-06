package messages

import controller.VisitorController

class DeleteMessage(val id: Int) : Message() {
    override fun visit(vc: VisitorController) {
        vc.visitDelete()
    }

}
