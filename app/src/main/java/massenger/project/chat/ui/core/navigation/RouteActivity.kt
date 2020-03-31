package massenger.project.chat.ui.core.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import massenger.project.chat.ui.App
import javax.inject.Inject

class RouteActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        App.appComponent.inject(this)

        navigator.showMain(this)
    }
}
