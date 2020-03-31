package massenger.project.chat.presentation.injection

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import massenger.project.chat.cache.AccountCacheImpl
import massenger.project.chat.cache.ChatDatabase
import massenger.project.chat.cache.SharedPrefsManager
import massenger.project.chat.data.account.AccountCache
import massenger.project.chat.data.friends.FriendsCache
import massenger.project.chat.data.messages.MessagesCache
import javax.inject.Singleton

@Module
class CacheModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    fun provideAccountCache(prefsManager: SharedPrefsManager, chatDatabase: ChatDatabase): AccountCache = AccountCacheImpl(prefsManager, chatDatabase)

    @Provides
    @Singleton
    fun provideChatDatabase(context: Context): ChatDatabase {
        return ChatDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideFriendsCache(chatDatabase: ChatDatabase): FriendsCache {
        return chatDatabase.friendsDao
    }

    @Provides
    @Singleton
    fun provideMessagesCache(chatDatabase: ChatDatabase): MessagesCache {
        return chatDatabase.messagesDao
    }
}