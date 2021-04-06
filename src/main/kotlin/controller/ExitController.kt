package controller

import kotlin.system.exitProcess

class ExitController : VisitorController {

    override fun visitExit() {
        exitProcess(0)
    }


}
