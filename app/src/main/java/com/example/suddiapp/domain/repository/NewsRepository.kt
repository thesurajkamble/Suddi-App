package com.example.suddiapp.domain.repository

import com.example.suddiapp.data.model.APIResponse
import com.example.suddiapp.data.model.Article
import com.example.suddiapp.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
     fun getSavedNews(): Flow<List<Article>>
}