package com.mylibrary.di

import com.mylibrary.repository.RepositoryProject
import com.mylibrary.source.api.APIInterface1
import com.mylibrary.source.api.ApiSource
import com.mylibrary.source.database.DbInterface
import com.mylibrary.source.database.DbSource
import org.koin.dsl.module

val dataModule = module {
    single<APIInterface1> {
        ApiSource()
    }

    single<DbInterface> {
        DbSource()
    }

    single {
        RepositoryProject(get() , get())
    }
}