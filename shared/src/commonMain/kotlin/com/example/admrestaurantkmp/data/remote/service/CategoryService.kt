package com.example.admrestaurantkmp.data.remote.service

import com.example.admrestaurantkmp.data.remote.response.ResponseCategory
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.delete
import io.ktor.client.request.forms.submitForm
import io.ktor.client.request.get
import io.ktor.http.parameters

class CategoryService(private val client: HttpClient) {

    suspend fun gerCategories(): ResponseCategory {
        return client.get("/categorias").body()
    }

    suspend fun addCategory(nameCategory: String): ResponseCategory {
        return client.submitForm(
            url = "/categorias/add",
            formParameters = parameters {
                append("nameCategory", nameCategory)
            }
        ).body()
    }

    suspend fun deleteCategory(nameCategory: String): ResponseCategory {
        return client.delete("/categorias/delete/$nameCategory").body()
    }

}