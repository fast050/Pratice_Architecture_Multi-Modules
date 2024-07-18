package com.mylibrary.repository

import com.mylibrary.model.ModelProject
import com.mylibrary.model.toModelProject
import com.mylibrary.source.api.APIInterface1
import com.mylibrary.source.api.ApiSource
import com.mylibrary.source.database.DbInterface
import com.mylibrary.source.database.DbSource

 class RepositoryProject internal constructor(
    private val apiSource: APIInterface1,
    private val dbSource: DbInterface
)  {

    suspend fun getData() : List<ModelProject>{
       val itemsApi = this.apiSource.getData().map {
            it.toModelProject()
        }

        val itemDb = this.dbSource.getData().map {
            it.toModelProject()
        }

        return itemsApi + itemDb
    }

}