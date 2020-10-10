package com.engmob.android.certification.core.paginglists.model

class Repository(private val retrofitClient: RetrofitClient) : RepositoryInterface {


    override suspend fun fetchList(page: Int, pageSize: Int, site: String): ListResponse {
        return retrofitClient.api.getList(page, pageSize, site)
    }
}