package bersatu.kita.pert11.Api

import bersatu.kita.pert11.Model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}