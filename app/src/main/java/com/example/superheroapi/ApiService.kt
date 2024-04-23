package com.example.superheroapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

const val ACCESS_TOKEN = 10229233666327556

interface ApiService {
    @GET("/api/${ACCESS_TOKEN}/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/${ACCESS_TOKEN}/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superHeroId: String): Response<SuperHeroDetailResponse>
}