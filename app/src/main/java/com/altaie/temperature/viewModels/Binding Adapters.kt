package com.altaie.temperature.viewModels

import android.view.View
import androidx.databinding.BindingAdapter
import com.altaie.temperature.R

@BindingAdapter(value = ["viewColor"])
fun setViewColor(view: View, temperature: String?) {
    temperature?.toDouble()?.let { value ->
        val color = when {
            value < 0 -> view.context.getColor(R.color.blue)
            value in 0.0..20.0 -> view.context.getColor(R.color.green)
            value in 21.0..30.0 -> view.context.getColor(R.color.yellow)
            value in 31.0..40.0 -> view.context.getColor(R.color.orange)
            else -> view.context.getColor(R.color.red)
        }
        view.setBackgroundColor(color)
    }
}