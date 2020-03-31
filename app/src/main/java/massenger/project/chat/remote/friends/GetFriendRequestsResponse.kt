package massenger.project.chat.remote.friends

import com.google.gson.annotations.SerializedName
import massenger.project.chat.domain.friends.FriendEntity
import massenger.project.chat.remote.core.BaseResponse

class GetFriendRequestsResponse (
    success: Int,
    message: String,
    @SerializedName("friend_requests")
    val friendsRequests: List<FriendEntity>
) : BaseResponse(success, message)