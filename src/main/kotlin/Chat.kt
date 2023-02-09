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
            true.also { message.isRead = it }
        return this.listMessage

    }

    fun deleteMesseges(idMessage: Int) {
        if (idMessage == Message().idMessage)
            this.listMessage.removeAt(idMessage)

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







