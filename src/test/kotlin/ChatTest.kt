import org.junit.Assert
import org.junit.Test

class ChatTest {
    @Test
    fun addMessageTest(){
        val chat=Chat()
        chat.addMessage("test")
        chat.addMessage("test 2")
        Assert.assertEquals(chat.items.size,2)

    }

    @Test
    fun deleteMessagesTest() {
        val chat = Chat()
        chat.addMessage("test")
        chat.addMessage("test 2")
        chat.delete(Message(id = 0))
        Assert.assertEquals(chat.items.size, 1)
    }

    @Test
    fun readMessagesTest() {
        val chat = Chat()
        val message = Message()
        chat.addMessage("test")
        chat.addMessage("test 2")
        chat.readMessages()
        Assert.assertEquals(chat.items.size, 2)
        Assert.assertFalse(message.isRead)
    }

}