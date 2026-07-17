package com.example.admrestaurantkmp.di

import com.example.admrestaurantkmp.domain.usecase.category.AddCategoryUseCase
import com.example.admrestaurantkmp.domain.usecase.category.DeleteCategoryUseCase
import com.example.admrestaurantkmp.domain.usecase.category.GetCategoryUseCase
import com.example.admrestaurantkmp.domain.usecase.dish.AddDishUseCase
import com.example.admrestaurantkmp.domain.usecase.dish.DeleteDishUseCase
import com.example.admrestaurantkmp.domain.usecase.dish.GetDishesUseCase
import com.example.admrestaurantkmp.domain.usecase.dish.UpdateDishUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetDishesUseCase(get()) }
    factory { AddDishUseCase(get()) }
    factory { UpdateDishUseCase(get()) }
    factory { DeleteDishUseCase(get()) }

    factory { GetCategoryUseCase(get()) }
    factory { AddCategoryUseCase(get()) }
    factory { DeleteCategoryUseCase(get()) }
}