package massenger.project.chat.remote.messages

import massenger.project.chat.domain.messages.MessageEntity
import massenger.project.chat.remote.core.BaseResponse

class GetMessagesResponse (
    success: Int,
    message: String,
    val messages: List<MessageEntity>
) : BaseResponse(success, message)