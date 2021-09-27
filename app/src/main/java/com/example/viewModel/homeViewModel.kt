package com.example.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class homeViewModel : ViewModel() {
    val name = MutableLiveData<String>()
    val img = MutableLiveData<String>()
    val desc = MutableLiveData<String>()
}