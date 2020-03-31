package massenger.project.chat.domain.friends

import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.None
import javax.inject.Inject

class DeleteFriend @Inject constructor(
    private val friendsRepository: FriendsRepository
) : UseCase<None, FriendEntity>() {

    override suspend fun run(params: FriendEntity) = friendsRepository.deleteFriend(params)
}