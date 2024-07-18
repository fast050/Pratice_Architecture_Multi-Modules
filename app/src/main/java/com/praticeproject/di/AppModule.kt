package com.praticeproject.di

import com.praticeproject.ViewModelProject
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        ViewModelProject(get())
    }
}