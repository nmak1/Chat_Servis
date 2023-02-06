@file:Suppress("UNUSED_EXPRESSION")

@Suppress("UNREACHABLE_CODE")
class ChatServes {


    val chats = hashMapOf<Int, Chat>()


    fun createChat(idUser: Int, message: String): Chat? {
        val chat = Chat(idUser)
        return chats.put(idUser,chat.apply { chat.addMessage(message) })


    }

    fun deleteChat(idUser: Int) {
        chats.remove(idUser)

    }
    fun getChats(): Map<Int,Chat> {

        return this.chats
    }
    fun getUnreadChatsCount(): Map<Int, Chat> {
       return chats.filter { entry ->entry.value.unreadMessages().isEmpty()  }
    }



}











