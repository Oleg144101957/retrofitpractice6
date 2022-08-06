package com.vishnevskiypro.retrofitpractice6.data.api

import com.vishnevskiypro.retrofitpractice6.models.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice6.models.nal.NalichkaModel
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApi {

    @GET("/p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneyFromNetwork() : Response<NalichkaModel>

    @GET("/p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneyFromNetwork() : Response<Beznalichka>

}