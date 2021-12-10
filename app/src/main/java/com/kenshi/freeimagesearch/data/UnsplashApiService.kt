package com.kenshi.freeimagesearch.data

import com.kenshi.freeimagesearch.BuildConfig
import com.kenshi.freeimagesearch.models.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApiService {

    @GET(
        "photos/random?" +
                "client_id=${BuildConfig.UNSPLASH_ACCESS_KEY}" +
                "&count=30"
    )

    suspend fun getRandomPhotos(
        //query 가 null 이면 전체를 가져오게 nullable 처리
        @Query("query") query: String?
    ): Response<List<PhotoResponse>>
}