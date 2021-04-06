package main

import controller.ActionController
import model.Model
import model.Persona
import view.CommandLineView

fun main() {
    var view = CommandLineView()
    var model = Model()

    var controller = ActionController(model)
    view.registraInteresse(controller)
    model.registraInteresse(view)

    while (true) {
        view.getInput()
        view.printOutput()
    }
}
