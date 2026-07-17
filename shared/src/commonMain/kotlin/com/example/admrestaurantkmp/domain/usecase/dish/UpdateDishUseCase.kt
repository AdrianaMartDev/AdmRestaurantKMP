package com.example.admrestaurantkmp.domain.usecase.dish

import com.example.admrestaurantkmp.domain.model.Dish
import com.example.admrestaurantkmp.domain.repository.DishRepository

class UpdateDishUseCase(
    private val repository: DishRepository
) {

    suspend operator fun invoke(nameDish: String, dish: Dish): Result<List<Dish>> {
        return repository.updateDish(nameDish, dish)
    }
}