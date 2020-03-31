package massenger.project.chat.data.account

import massenger.project.chat.domain.account.AccountEntity
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.None
import massenger.project.chat.domain.type.Failure

interface AccountCache {
    fun getToken(): Either<Failure, String>
    fun saveToken(token: String): Either<Failure, None>

    fun logout(): Either<Failure, None>

    fun getCurrentAccount(): Either<Failure, AccountEntity>
    fun saveAccount(account: AccountEntity): Either<Failure, None>

    fun checkAuth(): Either<Failure, Boolean>
}