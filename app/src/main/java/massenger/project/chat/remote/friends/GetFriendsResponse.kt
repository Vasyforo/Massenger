package massenger.project.chat.remote.friends

import massenger.project.chat.domain.friends.FriendEntity
import massenger.project.chat.remote.core.BaseResponse

class GetFriendsResponse (
    success: Int,
    message: String,
    val friends: List<FriendEntity>
) : BaseResponse(success, message)