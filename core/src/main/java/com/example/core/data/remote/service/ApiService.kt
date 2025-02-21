package com.example.core.data.remote.service

import com.example.core.data.remote.reponse.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("pokemon")
    suspend fun getPokemonList() : Response<PokemonResponse>
}