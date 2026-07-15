package com.example.admrestaurantkmp.data.remote.service

import com.example.admrestaurantkmp.data.remote.model.DataDish
import com.example.admrestaurantkmp.data.remote.response.ResponseDish
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody

class DishService(private val client: HttpClient) {

    suspend fun getDishes(): ResponseDish {
        return client.get("/platillos").body()
    }

    suspend fun addDish(dish: DataDish): ResponseDish {
        return client.post("/platillos/add") {
            setBody(dish)
        }.body()
    }

    suspend fun updateDish(nameDish: String, dish: DataDish): ResponseDish {
        return client.put("/platillos/update/$nameDish") {
            setBody(dish)
        }.body()
    }

    suspend fun deleteDish(nameDish: String): ResponseDish {
        return client.delete("/platillos/delete/$nameDish").body()
    }
}