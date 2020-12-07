package com.example.academyjetpack.ui.academy.di

import android.content.Context
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.data.source.remote.RemoteDataSource
import com.example.academyjetpack.utils.JsonHelper

object Injection {

    fun provideRepository(context: Context): AcademyRepository {
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }

}