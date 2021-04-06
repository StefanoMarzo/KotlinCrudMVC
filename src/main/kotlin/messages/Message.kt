package messages

import controller.VisitorController

abstract class Message {

    abstract fun visit(vc: VisitorController)

    fun visit(vararg vcs: VisitorController){
        vcs.forEach { visit(it) }
    }

}
