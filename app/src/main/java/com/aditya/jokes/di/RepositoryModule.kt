package com.aditya.jokes.di

import com.aditya.jokes.repos.JokesRepo
import com.aditya.jokes.repos.JokesRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindJokesRepository(
        jokesRepositoryImpl: JokesRepoImpl
    ): JokesRepo
}