package com.engmob.android.certification.core.paginglists

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // setup timber
        Timber.plant(Timber.DebugTree())

        startKoin {
            androidContext(this@AppApplication)
            modules(mainModule)
        }
    }
}