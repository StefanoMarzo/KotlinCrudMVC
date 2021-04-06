package model

class PersonList {

    var list = mutableListOf<Persona>()

    fun add(pers: Persona) {
        val newId = if(list.isEmpty()) 0 else list.maxOf { it.id } +1
        pers.id = newId
        list.add(pers)
    }

    fun remove(pers: Persona) {
        list.remove(pers)
    }

    fun remove(id: Int): Boolean {
        val newList = list.filter { it.id != id }.toMutableList()
        val removed = list != newList
        list = newList
        return removed
    }

    fun update(persona: Persona) {
        list[list.indexOf(list.filter { it.id == persona.id }[0])] = persona
    }

}
