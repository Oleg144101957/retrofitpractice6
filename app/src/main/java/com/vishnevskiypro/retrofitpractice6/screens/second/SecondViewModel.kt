package com.vishnevskiypro.retrofitpractice6.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice6.data.repository.Repository
import com.vishnevskiypro.retrofitpractice6.models.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel() {

    val repo = Repository()
    val myMoneyListLiveData: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalViewModel(){
        viewModelScope.launch {
            myMoneyListLiveData.value = repo.getBeznalRepo()
        }
    }


}