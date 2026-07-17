package com.example.admrestaurantkmp.domain.usecase.category

import com.example.admrestaurantkmp.domain.model.Category
import com.example.admrestaurantkmp.domain.repository.CategoryRepository

class GetCategoryUseCase(
    private val repository: CategoryRepository
) {

    suspend operator fun invoke(): Result<List<Category>> {
        return repository.getCategories()
    }

}