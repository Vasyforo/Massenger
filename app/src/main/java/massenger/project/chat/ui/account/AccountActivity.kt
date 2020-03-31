package massenger.project.chat.ui.account

import android.os.Bundle
import massenger.project.chat.ui.App
import massenger.project.chat.ui.core.BaseActivity
import massenger.project.chat.ui.core.BaseFragment

class AccountActivity : BaseActivity() {
    override var fragment: BaseFragment = AccountFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.appComponent.inject(this)
    }
}
