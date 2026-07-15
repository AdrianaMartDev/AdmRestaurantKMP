package com.example.admrestaurantkmp.domain.repository

import com.example.admrestaurantkmp.domain.model.Category

interface CategoryRepository {

    suspend fun getCategories():  Result<List<Category>>
    suspend fun addCategory(nameCategory: String): Result<Unit>
    suspend fun deleteCategory(nameCategory: String): Result<Unit>

}