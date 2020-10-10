package com.engmob.android.certification.core.paginglists

import com.engmob.android.certification.core.paginglists.model.Repository
import com.engmob.android.certification.core.paginglists.model.RetrofitClient
import com.engmob.android.certification.core.paginglists.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module(override = true) {
    single { RetrofitClient() }
    single { Repository(get()) }
    viewModel { MainViewModel(get()) }
}