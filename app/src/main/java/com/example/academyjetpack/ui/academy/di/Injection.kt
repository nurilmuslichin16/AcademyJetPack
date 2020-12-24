package com.example.academyjetpack.ui.academy.di

import android.content.Context
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.data.source.local.LocalDataSource
import com.example.academyjetpack.data.source.local.room.AcademyDatabase
import com.example.academyjetpack.data.source.remote.RemoteDataSource
import com.example.academyjetpack.utils.AppExecutors
import com.example.academyjetpack.utils.JsonHelper

object Injection {

    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

}