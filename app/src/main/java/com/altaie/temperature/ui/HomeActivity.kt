package com.altaie.temperature.ui

import androidx.activity.viewModels
import com.altaie.temperature.R
import com.altaie.temperature.databinding.ActivityHomeBinding
import com.altaie.temperature.ui.base.BaseActivity
import com.altaie.temperature.viewModels.HomeViewModel

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override val activity = this
    override val theme = R.style.Theme_Temperature
    override val viewID = R.layout.activity_home
    private val viewModel: HomeViewModel by viewModels()

    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}