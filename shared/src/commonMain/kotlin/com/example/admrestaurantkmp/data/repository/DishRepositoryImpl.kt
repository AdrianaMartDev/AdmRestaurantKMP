package com.example.admrestaurantkmp.data.repository

import com.example.admrestaurantkmp.data.remote.mapper.toData
import com.example.admrestaurantkmp.data.remote.mapper.toDomain
import com.example.admrestaurantkmp.data.remote.service.DishService
import com.example.admrestaurantkmp.domain.model.Dish
import com.example.admrestaurantkmp.domain.repository.DishRepository
import com.example.admrestaurantkmp.utils.safeApiCall

class DishRepositoryImpl(
    private val service: DishService
) : DishRepository {
    override suspend fun getDishes(): Result<List<Dish>> {
        return safeApiCall { service.getDishes() }
            .map { response -> response.datos.map { it.toDomain() } }
    }

    override suspend fun addDish(dish: Dish): Result<List<Dish>> {
        return safeApiCall { service.addDish(dish.toData()) }
            .map { response ->
                response.datos.map { it.toDomain() }
            }
    }

    override suspend fun updateDish(nameDish: String, dish: Dish): Result<List<Dish>> {
        return safeApiCall { service.updateDish(nameDish, dish.toData()) }
            .map { response -> response.datos.map { it.toDomain() } }
    }

    override suspend fun deleteDish(nameDish: String): Result<List<Dish>> {
        return safeApiCall { service.deleteDish(nameDish) }
            .map { response -> response.datos.map { it.toDomain() } }
    }
}