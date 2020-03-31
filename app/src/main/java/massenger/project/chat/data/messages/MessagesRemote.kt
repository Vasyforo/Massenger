package massenger.project.chat.data.messages

import massenger.project.chat.domain.messages.MessageEntity
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure
import massenger.project.chat.domain.type.None

interface MessagesRemote {

    fun getChats(userId: Long, token: String): Either<Failure, List<MessageEntity>>

    fun getMessagesWithContact(contactId: Long, userId: Long, token: String): Either<Failure, List<MessageEntity>>

    fun sendMessage(
        fromId: Long,
        toId: Long,
        token: String,
        message: String,
        image: String
    ): Either<Failure, None>

    fun deleteMessagesByUser(userId: Long, messageId: Long, token: String): Either<Failure, None>
}