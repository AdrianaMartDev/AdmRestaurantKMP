package com.example.admrestaurantkmp.di

import com.example.admrestaurantkmp.data.remote.createHttpClient
import com.example.admrestaurantkmp.data.remote.provideHttpClientEngine
import com.example.admrestaurantkmp.data.remote.service.CategoryService
import com.example.admrestaurantkmp.data.remote.service.DishService
import org.koin.dsl.module

val networkModule = module {
    single { createHttpClient(provideHttpClientEngine()) }
    single { DishService(get()) }
    single { CategoryService(get()) }
}