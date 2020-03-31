package massenger.project.chat.domain.account

import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.None
import javax.inject.Inject

class UpdateLastSeen @Inject constructor(
    private val accountRepository: AccountRepository
) : UseCase<None, None>() {

    override suspend fun run(params: None) = accountRepository.updateAccountLastSeen()
}