package massenger.project.chat.domain.messages

import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure
import massenger.project.chat.domain.type.None

interface MessagesRepository {
    fun sendMessage(
        toId: Long,
        message: String,
        image: String
    ): Either<Failure, None>

    fun getChats(needFetch: Boolean): Either<Failure, List<MessageEntity>>

    fun getMessagesWithContact(contactId: Long, needFetch: Boolean): Either<Failure, List<MessageEntity>>

    fun deleteMessagesByUser(messageId: Long): Either<Failure, None>
}