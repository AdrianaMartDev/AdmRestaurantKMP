package com.example.admrestaurantkmp.data.remote.response

import com.example.admrestaurantkmp.data.remote.model.DataDish
import kotlinx.serialization.Serializable

@Serializable
class ResponseDish (
    val codigo: String,
    val mensaje: String,
    val datos: List<DataDish>
){
}