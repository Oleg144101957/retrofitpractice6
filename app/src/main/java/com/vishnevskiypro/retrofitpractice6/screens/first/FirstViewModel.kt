package com.vishnevskiypro.retrofitpractice6.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice6.data.repository.Repository
import com.vishnevskiypro.retrofitpractice6.models.nal.NalichkaModel
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {

    val repo = Repository()
    val myMoneyListLiveData: MutableLiveData<Response<NalichkaModel>> = MutableLiveData()

    fun getNalichkaViewModel(){
        viewModelScope.launch {
            myMoneyListLiveData.value = repo.getNalRepo()
        }
    }


}