package com.engmob.android.certification.core.paginglists.model

import com.google.gson.annotations.SerializedName

data class ListResponse(
	@SerializedName("items") val items: List<Items>,
	@SerializedName("has_more") val has_more: Boolean,
	@SerializedName("backoff") val backoff: Int,
	@SerializedName("quota_max") val quota_max: Int,
	@SerializedName("quota_remaining") val quota_remaining: Int
)
