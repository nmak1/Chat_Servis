import org.junit.Assert
import org.junit.Test

class ChatTest {
    @Test
    fun addMessageTest(){
        val chat=Chat()
        chat.addMessage("test")
        chat.addMessage("test 2")
        Assert.assertEquals(chat.listMessage.size,2)

    }

    @Test
    fun deleteMessegesTest() {
        val chat = Chat()
        chat.addMessage("test")
        chat.addMessage("test 2")
        chat.deleteMesseges(0)
        Assert.assertEquals(chat.listMessage.size, 1)
    }

}