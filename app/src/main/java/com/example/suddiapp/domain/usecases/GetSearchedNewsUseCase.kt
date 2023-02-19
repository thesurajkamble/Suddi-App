package com.example.suddiapp.domain.usecases

import com.example.suddiapp.data.model.APIResponse
import com.example.suddiapp.data.utils.Resource
import com.example.suddiapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String): Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchQuery)
    }
}