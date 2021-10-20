package com.altaie.temperature.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altaie.temperature.model.repository.Repository

class HomeViewModel : ViewModel() {
    private val _celsius = MutableLiveData<String>()
    val celsius: LiveData<String> get() = _celsius

    fun changeTemperature(fahrenheit: CharSequence) {
            Repository.fahrenheitToCelsius(fahrenheit.toString()).apply {
                _celsius.postValue(String.format("%.2f", this))
        }
    }
}
