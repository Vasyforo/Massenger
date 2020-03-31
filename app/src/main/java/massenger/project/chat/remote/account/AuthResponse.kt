package massenger.project.chat.remote.account

import massenger.project.chat.domain.account.AccountEntity
import massenger.project.chat.remote.core.BaseResponse

class AuthResponse(
    success: Int,
    message: String,
    val user: AccountEntity
) : BaseResponse(success, message)