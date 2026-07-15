package com.example.admrestaurantkmp.data.remote.mapper

import com.example.admrestaurantkmp.data.remote.model.DataCategory
import com.example.admrestaurantkmp.domain.model.Category

fun DataCategory.toDomain(): Category {
    return Category(
        nameCategory = nameCategory,
        imageCategory = imageCategory
    )
}