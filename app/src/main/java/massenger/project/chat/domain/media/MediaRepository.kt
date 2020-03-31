package massenger.project.chat.domain.media

import android.graphics.Bitmap
import android.net.Uri
import massenger.project.chat.domain.type.Either
import massenger.project.chat.domain.type.Failure

interface MediaRepository {
    fun createImageFile(): Either<Failure, Uri>
    fun encodeImageBitmap(bitmap: Bitmap?): Either<Failure, String>
    fun getPickedImage(uri: Uri?): Either<Failure, Bitmap>
}