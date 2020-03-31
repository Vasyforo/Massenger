package massenger.project.chat.domain.account

import massenger.project.chat.domain.type.None
import massenger.project.chat.domain.interactor.UseCase
import javax.inject.Inject

class UpdateToken @Inject constructor(
    private val accountRepository: AccountRepository
) : UseCase<None, UpdateToken.Params>() {

    override suspend fun run(params: Params) = accountRepository.updateAccountToken(params.token)

    data class Params(val token: String)
}