package com.mylibrary.usecase

import com.mylibrary.model.ModelProject
import com.mylibrary.repository.RepositoryProject
import kotlinx.coroutines.delay

class GetDataUseCase internal constructor(
    private val repositoryProject: RepositoryProject
) {
     suspend operator fun invoke() : List<ModelProject>{
         delay(5000)

        return repositoryProject.getData()
      }
}