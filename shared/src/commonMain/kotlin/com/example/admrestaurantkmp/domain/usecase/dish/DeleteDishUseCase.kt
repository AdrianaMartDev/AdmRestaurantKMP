package com.example.admrestaurantkmp.domain.usecase.dish

import com.example.admrestaurantkmp.domain.model.Dish
import com.example.admrestaurantkmp.domain.repository.DishRepository

class DeleteDishUseCase(
    private val repository: DishRepository
) {

    suspend operator fun invoke(nameDish: String): Result<List<Dish>> {
        return repository.deleteDish(nameDish)
    }

}