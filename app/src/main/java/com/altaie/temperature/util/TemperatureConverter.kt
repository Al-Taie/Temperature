package com.altaie.temperature.util

object TemperatureConverter {
    fun fahrenheitToCelsius(fahrenheit: String): Double {
        if (fahrenheit.isEmpty()) return 0.0
        return (fahrenheit.toDouble() - 32) / 1.8
    }
}