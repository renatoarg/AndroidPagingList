package com.engmob.android.certification.core.paginglists.model

interface RepositoryInterface {

    suspend fun fetchList(page: Int, pageSize: Int, site: String): ListResponse

}
