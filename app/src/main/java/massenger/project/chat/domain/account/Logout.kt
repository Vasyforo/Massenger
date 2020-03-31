package massenger.project.chat.domain.account

import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure
import massenger.project.chat.domain.type.None
import javax.inject.Inject

class Logout @Inject constructor(
    private val accountRepository: AccountRepository
) : UseCase<None, None>() {

    override suspend fun run(params: None): Either<Failure, None> = accountRepository.logout()
}