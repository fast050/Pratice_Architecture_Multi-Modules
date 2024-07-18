package com.praticeproject

import android.app.Application
import com.mylibrary.di.dataModule
import com.praticeproject.di.appModule
import org.koin.core.context.startKoin

class ApplicationPractice :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(dataModule , appModule)
        }
    }
}