package com.example.suddiapp.data.repository.dataSourceImpl

import com.example.suddiapp.data.api.NewsApiService
import com.example.suddiapp.data.model.APIResponse
import com.example.suddiapp.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService,
    private val country: String,
    private val page:Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsApiService.getTopHeadlines(country,page)
    }
}