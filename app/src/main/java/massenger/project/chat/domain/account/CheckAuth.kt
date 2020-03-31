package massenger.project.chat.domain.account

import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure
import massenger.project.chat.domain.type.None
import javax.inject.Inject

class CheckAuth @Inject constructor(
    private val accountRepository: AccountRepository
) : UseCase<Boolean, None>() {

    override suspend fun run(params: None): Either<Failure, Boolean> = accountRepository.checkAuth()
}