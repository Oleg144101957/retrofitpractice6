package com.vishnevskiypro.retrofitpractice6.data.repository

import com.vishnevskiypro.retrofitpractice6.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice6.models.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice6.models.nal.NalichkaModel
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun getNalRepo() : Response<NalichkaModel>{
        return RetrofitInstance.api.getNalMoneyFromNetwork()
    }

    suspend fun getBeznalRepo() : Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalMoneyFromNetwork()
    }

}