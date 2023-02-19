package com.example.suddiapp.domain.usecases

import com.example.suddiapp.data.model.APIResponse
import com.example.suddiapp.data.model.Article
import com.example.suddiapp.data.utils.Resource
import com.example.suddiapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}