package com.altaie.temperature.model.repository

import com.altaie.temperature.util.TemperatureConverter

object Repository {
    fun fahrenheitToCelsius(fahrenheit: String): Double = TemperatureConverter.fahrenheitToCelsius(fahrenheit)
}