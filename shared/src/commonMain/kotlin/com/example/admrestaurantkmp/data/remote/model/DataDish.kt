package com.example.admrestaurantkmp.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataDish(
    @SerialName("nom_platillo")
    val nameDish: String = "",
    @SerialName("descripcion_platillo")
    val descriptionDish: String = "",
    @SerialName("precio")
    val priceDish: Double = 0.0,
    @SerialName("nom_categoria")
    val category: String = ""
)