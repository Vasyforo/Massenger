package massenger.project.chat.presentation

import massenger.project.chat.domain.account.CheckAuth
import massenger.project.chat.domain.type.None
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Authenticator
@Inject constructor(
    val checkAuth: CheckAuth
) {
    fun userLoggedIn(body: (Boolean) -> Unit) {
        checkAuth(None()) {
            it.either({ body(false) }, { body(it) })
        }
    }
}