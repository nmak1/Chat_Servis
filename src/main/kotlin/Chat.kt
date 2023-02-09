class Chat(
    var idUser: Int?=null,
    val date: Long = System.currentTimeMillis(),
) {
    var listMessage: MutableList<Message> = mutableListOf()

    fun addMessage(text: String): List<Message> {

        listMessage.add(Message(text, idMessage = Message().idMessage + 1))
            .apply {listMessage.sortedBy { date } }
       return this.listMessage

    }

    fun readMessages(): List<Message> {
        for (message in listMessage)
            message.isRead = true
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







