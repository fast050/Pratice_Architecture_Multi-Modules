package com.mylibrary.model

import com.mylibrary.source.api.model.APIModelProject
import com.mylibrary.source.database.model.DbModelProject

data class ModelProject(
    val name:String
)

internal fun APIModelProject.toModelProject(): ModelProject {
    return ModelProject(
        this.name
    )
}

internal fun DbModelProject.toModelProject() : ModelProject{
    return ModelProject(
        this.name
    )
}
