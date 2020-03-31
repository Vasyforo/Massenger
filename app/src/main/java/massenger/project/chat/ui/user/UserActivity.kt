package massenger.project.chat.ui.user

import android.os.Bundle
import massenger.project.chat.ui.App
import massenger.project.chat.ui.core.BaseActivity
import massenger.project.chat.ui.core.BaseFragment

class UserActivity : BaseActivity() {
    override var fragment: BaseFragment = UserFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.appComponent.inject(this)
    }
}
