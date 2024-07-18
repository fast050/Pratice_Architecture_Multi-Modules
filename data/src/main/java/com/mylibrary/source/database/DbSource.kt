package com.mylibrary.source.database

import com.mylibrary.source.api.ApiSource
import com.mylibrary.source.api.model.APIModelProject
import com.mylibrary.source.database.model.DbModelProject

internal class DbSource() : DbInterface {
    override suspend fun getData(): List<DbModelProject> {
        return listOf(
            DbModelProject(
                "Api data 1"
            ) ,
            DbModelProject(
                "Api data 2"
            ),
            DbModelProject(
                "Api data 3"
            )
        )
    }
}