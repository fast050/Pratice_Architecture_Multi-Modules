package com.mylibrary.source.database

import com.mylibrary.source.database.model.DbModelProject

internal interface DbInterface {
    suspend fun getData() : List<DbModelProject>
}