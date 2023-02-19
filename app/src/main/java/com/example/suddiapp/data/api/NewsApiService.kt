package com.example.suddiapp.data.api

import androidx.core.os.BuildCompat
import com.example.suddiapp.BuildConfig
import com.example.suddiapp.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = BuildConfig.API_KEY
    ):Response<APIResponse>
}