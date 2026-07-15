package com.example.admrestaurantkmp.utils

import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.statement.bodyAsText

suspend fun <T> safeApiCall(apiCall: suspend () -> T): Result<T> {
    return try {
        Result.success(apiCall.invoke())
    } catch (e: ClientRequestException) {
        //errors code 4xx
        val errorBody = e.response.bodyAsText()
        println("API_DEBUG: error ${e.response.status}: $errorBody")
        Result.failure(Exception("Request failed with code ${e.response.status}"))
    } catch (e: ServerResponseException) {
        //errors code 5xx
        Result.failure(Exception("Request failed with code ${e.response.status}"))
    } catch (e: Exception) {
        Result.failure(e)
    }
}