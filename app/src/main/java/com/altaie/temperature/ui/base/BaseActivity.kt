package com.altaie.temperature.ui.base

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {
    abstract fun setup()
    abstract val activity: Activity
    abstract val theme: Int
    abstract val viewID: Int
    private lateinit var _binding: VDB
    protected val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(activity, viewID)
        setup()
    }
}