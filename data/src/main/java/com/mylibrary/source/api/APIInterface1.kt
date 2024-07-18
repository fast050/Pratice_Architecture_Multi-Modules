package com.mylibrary.source.api

import com.mylibrary.source.api.model.APIModelProject

internal interface APIInterface1 {
    suspend fun getData() : List<APIModelProject>
}