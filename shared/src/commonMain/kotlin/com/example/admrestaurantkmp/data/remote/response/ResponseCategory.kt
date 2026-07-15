package com.example.admrestaurantkmp.data.remote.response

import com.example.admrestaurantkmp.data.remote.model.DataCategory
import kotlinx.serialization.Serializable

@Serializable
data class ResponseCategory(
    val codigo: String,
    val mensaje: String,
    val datos: List<DataCategory>
) {
}