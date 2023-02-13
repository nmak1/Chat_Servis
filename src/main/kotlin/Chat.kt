class Chat(
    var idUser: Int? = null,
    val date: Long = System.currentTimeMillis(),
) : Serves<Message>() {


    fun addMessage(text: String): List<Message> {

        add(Message(text=text))
            .apply { items.sortedBy { date } }
        return this.items

    }

    fun readMessages(): List<Message> {
        items.forEach { message ->
            message.isRead = true
        }
        return this.items

    }

    fun deleteMesseges(idMessage: Int) {
        if (idMessage == Message().id)
            this.items.removeAt(idMessage)

    }

    fun unreadMessages(): List<Message> {
        return items.filter { items -> !items.isRead }
    }

    override fun toString(): String {
        var result = "[ chat "
        items.forEach { message ->
            result += " $message"
        }
        return result + "]"
    }


    override fun delete(elem: Elem) {
        if (elem.id == Message().id)
            elem.id?.let { this.items.removeAt(it) }
    }


}









