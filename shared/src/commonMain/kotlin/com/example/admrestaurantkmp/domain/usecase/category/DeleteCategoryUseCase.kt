package com.example.admrestaurantkmp.domain.usecase.category

import com.example.admrestaurantkmp.domain.repository.CategoryRepository

class DeleteCategoryUseCase(
    private val repository: CategoryRepository
) {

    suspend operator fun invoke(nameCategory: String): Result<Unit> {
        return repository.deleteCategory(nameCategory)
    }

}