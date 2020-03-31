package massenger.project.chat.ui.home

import android.os.Bundle
import massenger.project.chat.ui.App
import massenger.project.chat.ui.core.BaseActivity
import massenger.project.chat.ui.core.BaseFragment

class MessagesActivity : BaseActivity() {
    override var fragment: BaseFragment = MessagesFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.appComponent.inject(this)
    }
}
