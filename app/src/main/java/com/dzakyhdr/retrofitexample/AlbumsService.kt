package com.dzakyhdr.retrofitexample

import retrofit2.Response
import retrofit2.http.GET

interface AlbumsService {

    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>
}