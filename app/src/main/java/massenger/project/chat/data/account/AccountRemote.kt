package massenger.project.chat.data.account

import massenger.project.chat.domain.account.AccountEntity
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.None
import massenger.project.chat.domain.type.Failure

interface AccountRemote {
    fun register(
        email: String,
        name: String,
        password: String,
        token: String,
        userDate: Long
    ): Either<Failure, None>

    fun login(email: String, password: String, token: String): Either<Failure, AccountEntity>

    fun updateToken(userId: Long, token: String, oldToken: String): Either<Failure, None>

    fun editUser(
        userId: Long,
        email: String,
        name: String,
        password: String,
        status: String,
        token: String,
        image: String
    ): Either<Failure, AccountEntity>

    fun updateAccountLastSeen(userId: Long, token: String, lastSeen: Long): Either<Failure, None>
}