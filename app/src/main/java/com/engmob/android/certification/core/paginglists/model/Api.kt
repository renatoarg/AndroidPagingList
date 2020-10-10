package com.engmob.android.certification.core.paginglists.model

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("answers")
    suspend fun getList(
        @Query("page") page: Int,
        @Query("pagesize") pagesize: Int,
        @Query("site") site: String
    ): ListResponse
}