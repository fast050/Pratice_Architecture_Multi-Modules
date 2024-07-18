package com.mylibrary.source.api

import com.mylibrary.source.api.model.APIModelProject

internal class ApiSource : APIInterface1 {

    override suspend fun getData(): List<APIModelProject> {
        return listOf(
            APIModelProject(
            "Api data 1"
        ) ,
            APIModelProject(
                "Api data 2"
        ),
            APIModelProject(
                "Api data 3"
            )
        )
    }
}