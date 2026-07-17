package com.example.admrestaurantkmp.domain.usecase.category

import com.example.admrestaurantkmp.domain.model.Category
import com.example.admrestaurantkmp.domain.repository.CategoryRepository

class AddCategoryUseCase(
    private val repository: CategoryRepository
) {

    suspend operator fun invoke(category: Category): Result<Unit>{
        return repository.addCategory(category.nameCategory)
    }

}