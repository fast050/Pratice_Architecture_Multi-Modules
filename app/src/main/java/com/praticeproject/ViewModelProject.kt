package com.praticeproject

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mylibrary.repository.RepositoryProject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ViewModelProject(
    private val repositoryProject: RepositoryProject
) : ViewModel() {

    private val _text = MutableStateFlow("")
    val text = _text.asStateFlow()


    fun getData() = viewModelScope.launch {
        _text.value = repositoryProject.getData().map { it.name }[0]
    }

}