import org.junit.Assert.assertEquals
import org.junit.Test

class ChatServesTest {
    @Test
    fun addNewChatTest() {
        val service = ChatServes()
        service.createChat(1, message = "message")
        service.createChat(2, message = "test")
        assertEquals(service.getChats().size, 2)

    }

    @Test
    fun deleteChatTest() {
        val service = ChatServes()
        service.createChat(1, message = "message")
        service.createChat(2, message = "test")
        service.deleteChat(1)
        assertEquals(service.chats.size, 1)
    }

    @Test
    fun getUnreadChatsCountTest() {
        val service = ChatServes()
        val chat = Chat(idUser = 1)
        chat.readMessages()
        service.createChat(1, message = "message")
        service.createChat(1, message = "test")
        assertEquals(service.getUnreadChatsCount().size, 0)
    }
}