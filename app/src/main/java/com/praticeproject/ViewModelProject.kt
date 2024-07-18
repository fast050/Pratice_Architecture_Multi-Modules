package com.praticeproject

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mylibrary.usecase.GetDataUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ViewModelProject(
    private val getDataUseCase: GetDataUseCase
) : ViewModel() {

    private val _text = MutableStateFlow("")
    val text = _text.asStateFlow()


    fun getData() = viewModelScope.launch {
        _text.value = getDataUseCase().map { it.name }[0]
    }

}