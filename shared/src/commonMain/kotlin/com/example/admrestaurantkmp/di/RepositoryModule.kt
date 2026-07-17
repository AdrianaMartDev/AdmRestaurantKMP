package com.example.admrestaurantkmp.di

import com.example.admrestaurantkmp.data.repository.CategoryRepositoryImpl
import com.example.admrestaurantkmp.data.repository.DishRepositoryImpl
import com.example.admrestaurantkmp.domain.repository.CategoryRepository
import com.example.admrestaurantkmp.domain.repository.DishRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<DishRepository> { DishRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
}