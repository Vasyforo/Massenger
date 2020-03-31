package massenger.project.chat.ui

import android.app.Application
import dagger.Component
import massenger.project.chat.presentation.injection.AppModule
import massenger.project.chat.presentation.injection.CacheModule
import massenger.project.chat.presentation.injection.RemoteModule
import massenger.project.chat.presentation.injection.ViewModelModule
import massenger.project.chat.ui.account.AccountActivity
import massenger.project.chat.ui.account.AccountFragment
import massenger.project.chat.ui.core.navigation.RouteActivity
import massenger.project.chat.ui.firebase.FirebaseService
import massenger.project.chat.ui.friends.FriendRequestsFragment
import massenger.project.chat.ui.friends.FriendsFragment
import massenger.project.chat.ui.home.HomeActivity
import massenger.project.chat.ui.home.ChatsFragment
import massenger.project.chat.ui.home.MessagesActivity
import massenger.project.chat.ui.home.MessagesFragment
import massenger.project.chat.ui.login.LoginFragment
import massenger.project.chat.ui.register.RegisterActivity
import massenger.project.chat.ui.register.RegisterFragment
import massenger.project.chat.ui.user.UserActivity
import massenger.project.chat.ui.user.UserFragment
import javax.inject.Singleton

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this)).build()
    }
}

@Singleton
@Component(modules = [AppModule::class, CacheModule::class, RemoteModule::class, ViewModelModule::class])
interface AppComponent {

    //activities
    fun inject(activity: RegisterActivity)
    fun inject(activity: RouteActivity)
    fun inject(activity: HomeActivity)
    fun inject(activity: AccountActivity)
    fun inject(activity: MessagesActivity)
    fun inject(activity: UserActivity)

    //fragments
    fun inject(fragment: RegisterFragment)
    fun inject(fragment: LoginFragment)
    fun inject(fragment: ChatsFragment)
    fun inject(fragment: FriendsFragment)
    fun inject(fragment: FriendRequestsFragment)
    fun inject(fragment: AccountFragment)
    fun inject(fragment: MessagesFragment)
    fun inject(fragment: UserFragment)

    //services
    fun inject(service: FirebaseService)
}