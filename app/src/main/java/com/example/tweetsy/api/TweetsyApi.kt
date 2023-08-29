package com.example.tweetsy.api

import com.example.tweetsy.models.Tweet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyApi {

    @GET("/v3/b/64ed74489d312622a397d97d?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<Tweet>>   // this header is dynamic type

    @GET("/v3/b/64ed74489d312622a397d97d?meta=false")
    @Headers("X-JSON-Path : tweets..category")           // but this Headers is static type we only want selected categories
    suspend fun getCategories() : Response<List<String>>
}