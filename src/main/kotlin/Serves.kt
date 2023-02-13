abstract class Serves<T : Elem> {
    open val items: MutableList<T> = mutableListOf<T>()


    open fun add(elem: T): T {
        items += elem
        elem.id= elem.id!! +1
        return items.last()

    }

    abstract fun delete(elem: Elem)

}