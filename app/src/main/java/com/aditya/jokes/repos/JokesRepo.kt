package com.aditya.jokes.repos

import com.aditya.jokes.data.local.JokesEntity
import kotlinx.coroutines.flow.Flow


interface JokesRepo {
    suspend fun fetchUnbookmarkedJokes(genre: String, amount: Int): Flow<List<JokesEntity>>
    suspend fun updateBookmarkStatus(id: Int, bookmarked: Boolean)
    fun fetchBookmarkedJokes(): Flow<List<JokesEntity>>
    suspend fun deleteUnbookmarkedJokes()
    suspend fun deleteJokeViaId(id: Int)
}