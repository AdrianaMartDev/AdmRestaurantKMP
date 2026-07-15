package com.example.admrestaurantkmp.data.remote.mapper

import com.example.admrestaurantkmp.data.remote.model.DataDish
import com.example.admrestaurantkmp.domain.model.Dish

fun DataDish.toDomain(): Dish {
    return Dish(
        nameDish = nameDish,
        descDish = descriptionDish,
        priceDish = priceDish,
        category = category
    )
}

fun Dish.toData(): DataDish {
    return DataDish(
        nameDish = nameDish,
        descriptionDish = descDish,
        priceDish = priceDish,
        category = category
    )
}