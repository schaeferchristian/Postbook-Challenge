package de.adessomobile.postbookchallenge.base

import android.app.Application
import de.adessomobile.postbookchallenge.data.dataKoinModule
import de.adessomobile.postbookchallenge.repository.repositoryKoinModule
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin(
            this, listOf(
                dataKoinModule,
                repositoryKoinModule
            )
        )
    }
}