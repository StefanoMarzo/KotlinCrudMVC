package utilities

open class Observable {

    var observers = mutableListOf<Observer>()

    fun registraInteresse(o: Observer) {
        observers.add(o)
    }

    fun rimuoviInteresse(o: Observer) {
        observers.remove(o)
    }

    fun notificaGliInteressati(){
        for(o in observers) {
            o.update(this)
        }
    }

}