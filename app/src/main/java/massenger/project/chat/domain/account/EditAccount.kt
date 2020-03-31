package massenger.project.chat.domain.account

import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure
import javax.inject.Inject

class EditAccount @Inject constructor(
    private val repository: AccountRepository
) : UseCase<AccountEntity, AccountEntity>() {

    override suspend fun run(params: AccountEntity): Either<Failure, AccountEntity> {
        return repository.editAccount(params)
    }
}