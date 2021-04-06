package model

import utilities.Observable

class Model: Observable() {

    var presentazione = ""
    var personList = PersonList()

    fun getListaPersone(): String {
        var s = "Lista Persone:\n"
        personList.list.forEach {
            s = s.plus(it.toString()).plus("\n")
        }
        return s
    }

}
