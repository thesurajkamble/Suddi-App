package com.example.suddiapp.domain.usecases

import com.example.suddiapp.data.model.APIResponse
import com.example.suddiapp.data.utils.Resource
import com.example.suddiapp.domain.repository.NewsRepository

class GetNewsHeadLinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines()
    }
}