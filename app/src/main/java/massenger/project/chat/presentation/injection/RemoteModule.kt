package massenger.project.chat.presentation.injection

import dagger.Module
import dagger.Provides
import massenger.project.chat.BuildConfig
import massenger.project.chat.data.account.AccountRemote
import massenger.project.chat.data.friends.FriendsRemote
import massenger.project.chat.data.messages.MessagesRemote
import massenger.project.chat.remote.account.AccountRemoteImpl
import massenger.project.chat.remote.core.Request
import massenger.project.chat.remote.friends.FriendsRemoteImpl
import massenger.project.chat.remote.messages.MessagesRemoteImpl
import massenger.project.chat.remote.service.ApiService
import massenger.project.chat.remote.service.ServiceFactory
import javax.inject.Singleton

@Module
class RemoteModule {

    @Singleton
    @Provides
    fun provideApiService(): ApiService = ServiceFactory.makeService(BuildConfig.DEBUG)

    @Singleton
    @Provides
    fun provideAccountRemote(request: Request, apiService: ApiService): AccountRemote {
        return AccountRemoteImpl(request, apiService)
    }

    @Singleton
    @Provides
    fun provideFriendsRemote(request: Request, apiService: ApiService): FriendsRemote {
        return FriendsRemoteImpl(request, apiService)
    }

    @Singleton
    @Provides
    fun provideMessagesRemote(request: Request, apiService: ApiService): MessagesRemote {
        return MessagesRemoteImpl(request, apiService)
    }
}