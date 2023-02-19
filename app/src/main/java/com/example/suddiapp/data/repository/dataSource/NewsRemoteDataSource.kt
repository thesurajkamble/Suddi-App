package com.example.suddiapp.data.repository.dataSource

import com.example.suddiapp.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines():Response<APIResponse>
}