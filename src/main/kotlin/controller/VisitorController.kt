package controller

interface VisitorController {

    fun visitCreate(){}
    fun visitRead(){}
    fun visitDelete(){}
    fun visitUpdate(){}
    fun visitExit(){}
    fun visitAbort(){}

}
