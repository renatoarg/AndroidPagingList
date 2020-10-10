package com.engmob.android.certification.core.paginglists.ui

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import com.engmob.android.certification.core.paginglists.model.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel(private val repository: Repository) : ViewModel(), LifecycleObserver {

    fun fetchList() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = repository.fetchList(1, 50, "stackoverflow")
            Timber.d("fetchList size: ${response.items.size}")
            response.items.forEach {
                Timber.d("-: ${it.owner.display_name}")
            }

        }
    }
}