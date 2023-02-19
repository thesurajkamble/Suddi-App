package com.example.suddiapp.domain.usecases

import com.example.suddiapp.data.model.Article
import com.example.suddiapp.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): kotlinx.coroutines.flow.Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}