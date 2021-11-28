import mail.Client
import mail.Mailer
import mail.PersonalInfo
import mail.sendMessageToClient
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock

class TestMailer {

    @Test
    fun calledWithNonNullParameters()
    {
        val mailer = mock(Mailer::class.java)
        // fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer)
        val personalInfo = PersonalInfo("dima@mail.ru")
        val client = Client(personalInfo)
        val message = "message"

        sendMessageToClient(client, message, mailer)
        Mockito.verify(mailer).sendMessage("dima@mail.ru", "message")
        Mockito.verifyNoMoreInteractions(mailer)
    }


    // TODO sendMessageToClient(null, "message", mailer) --> методы mailer не вызываются
    @Test
    fun notCalledWithNullClient()
    {

        val mailer = mock(Mailer::class.java)
        sendMessageToClient(null, "message", mailer)
        Mockito.verifyNoMoreInteractions(mailer)
    }

    // TODO sendMessageToClient(client, null, mailer)    --> методы mailer не вызываются
    @Test
    fun notCalledWithNullMessage()
    {
        val mailer = mock(Mailer::class.java)
        val client = Client(PersonalInfo("dima@mail.ru"))
        sendMessageToClient(client, null, mailer)
        Mockito.verifyNoMoreInteractions(mailer)
    }
}