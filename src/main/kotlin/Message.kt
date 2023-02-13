class Message(
    var text:String? = null,
    var isRead: Boolean = false,
    id: Int = 0
) : Elem( id) {}