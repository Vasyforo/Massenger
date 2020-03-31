package massenger.project.chat.presentation.injection

import android.content.Context
import dagger.Module
import dagger.Provides
import massenger.project.chat.data.account.AccountCache
import massenger.project.chat.data.account.AccountRemote
import massenger.project.chat.data.account.AccountRepositoryImpl
import massenger.project.chat.data.friends.FriendsCache
import massenger.project.chat.data.friends.FriendsRemote
import massenger.project.chat.data.friends.FriendsRepositoryImpl
import massenger.project.chat.data.media.MediaRepositoryImpl
import massenger.project.chat.data.messages.MessagesCache
import massenger.project.chat.data.messages.MessagesRemote
import massenger.project.chat.data.messages.MessagesRepositoryImpl
import massenger.project.chat.domain.account.AccountRepository
import massenger.project.chat.domain.friends.FriendsRepository
import massenger.project.chat.domain.media.MediaRepository
import massenger.project.chat.domain.messages.MessagesRepository
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideAppContext(): Context = context

    @Provides
    @Singleton
    fun provideAccountRepository(remote: AccountRemote, cache: AccountCache): AccountRepository {
        return AccountRepositoryImpl(remote, cache)
    }

    @Provides
    @Singleton
    fun provideFriendsRepository(remote: FriendsRemote, accountCache: AccountCache, friendsCache: FriendsCache): FriendsRepository {
        return FriendsRepositoryImpl(accountCache, remote, friendsCache)
    }

    @Provides
    @Singleton
    fun provideMediaRepository(context: Context): MediaRepository {
        return MediaRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideMessagesRepository(remote: MessagesRemote, cache: MessagesCache, accountCache: AccountCache): MessagesRepository {
        return MessagesRepositoryImpl(remote, cache, accountCache)
    }
}