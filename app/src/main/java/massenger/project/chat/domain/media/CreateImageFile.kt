package massenger.project.chat.domain.media

import android.net.Uri
import massenger.project.chat.domain.interactor.UseCase
import massenger.project.chat.domain.type.None
import javax.inject.Inject

class CreateImageFile @Inject constructor(
    private val mediaRepository: MediaRepository
) : UseCase<Uri, None>() {

    override suspend fun run(params: None) = mediaRepository.createImageFile()
}