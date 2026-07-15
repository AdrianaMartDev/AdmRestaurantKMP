package com.example.admrestaurantkmp.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataCategory(
    @SerialName("nom_categoria")
    val nameCategory: String,
    @SerialName("img_categoria")
    val imageCategory: String
) {
}