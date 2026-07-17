package com.example.admrestaurantkmp.domain.usecase.dish

import com.example.admrestaurantkmp.domain.model.Dish
import com.example.admrestaurantkmp.domain.repository.DishRepository

class AddDishUseCase(
    private val repository: DishRepository
) {

    suspend operator fun invoke(dish: Dish): Result<List<Dish>> {
        return repository.addDish(dish)
    }

}