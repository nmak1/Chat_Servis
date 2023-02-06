class Chat(
    var idUser: Int?=null,
    val date: Long = System.currentTimeMillis(),
) {
    var listMessage: MutableList<Message> = mutableListOf()

    fun addMessage(text: String): List<Message> {

        listMessage.add(Message(text, idMessage = Message().idMessage + 1))
        return listMessage.sortedBy { date }

    }

    fun readMessages(): List<Message> {
        for (message in listMessage)
            message.isRead = true
        return listMessage
    }

    fun deleteMesseges(idMessage: Int) {
        if (idMessage == Message().idMessage)
            listMessage.removeAt(idMessage)

    }

    fun unreadMessages(): List<Message> {
        return listMessage.filter {listMessage-> !listMessage.isRead }
    }

    override fun toString(): String {
        var result = "[ chat "
        listMessage.forEach { message ->
            result += " $message"
        }
        return result + "]"
    }



}

//private fun <E> MutableList<E>.filter(predicate: (E) -> Unit): List<E> {
//
//}





