package com.example.admrestaurantkmp.domain.usecase.dish

import com.example.admrestaurantkmp.domain.model.Dish
import com.example.admrestaurantkmp.domain.repository.DishRepository

class GetDishesUseCase(
    private val repository: DishRepository
) {
    suspend operator fun invoke(): Result<List<Dish>>{
        return repository.getDishes()
    }
}