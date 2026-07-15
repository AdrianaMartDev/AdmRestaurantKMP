package com.example.admrestaurantkmp.data.repository

import com.example.admrestaurantkmp.data.remote.mapper.toDomain
import com.example.admrestaurantkmp.data.remote.service.CategoryService
import com.example.admrestaurantkmp.domain.model.Category
import com.example.admrestaurantkmp.domain.repository.CategoryRepository
import com.example.admrestaurantkmp.utils.safeApiCall

class CategoryRepositoryImpl(
    private val service: CategoryService
) : CategoryRepository {
    override suspend fun getCategories(): Result<List<Category>> {
        return safeApiCall { service.gerCategories() }
            .map { response -> response.datos.map { it.toDomain() } }
    }

    override suspend fun addCategory(nameCategory: String): Result<Unit> {
        return safeApiCall { service.addCategory(nameCategory) }
            .map { }
    }

    override suspend fun deleteCategory(nameCategory: String): Result<Unit> {
        return safeApiCall { service.deleteCategory(nameCategory) }
            .map { }
    }
}