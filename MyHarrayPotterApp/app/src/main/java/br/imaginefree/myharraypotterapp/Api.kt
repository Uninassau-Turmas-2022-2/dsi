package br.imaginefree.myharraypotterapp

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    companion object {
        const val BASE_URL = "https://hp-api.herokuapp.com"
    }

    @GET("/api/spells")
    fun getSpells(): Call<List<Spells>>

}