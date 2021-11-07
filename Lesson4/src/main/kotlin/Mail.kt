interface Mailer {
    fun sendMail(email: String, message: String)
}

class PersonalInfo(val email: String?)

class Client(val info: PersonalInfo?)

fun sendMessage(client: Client?, message: String?, mailer: Mailer) {

    // TODO только если есть email != null и message != null
//    if (client != null && client.info != null && client.info.email != null && message != null) {
    if (client?.info?.email != null && message != null) {
        mailer.sendMail(client.info.email, message)
    }
}