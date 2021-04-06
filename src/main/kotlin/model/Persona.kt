package model

class Persona(var id: Int, var name: String, var surname: String) {
    override fun toString() = "$id $name $surname"
}
