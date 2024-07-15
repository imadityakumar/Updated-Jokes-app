package com.aditya.jokes.ui.screens

import com.aditya.jokes.data.local.JokesEntity


sealed class UIstate {
    data object Initial : UIstate()
    data object Loading : UIstate()
    class Success(val jokesList: List<JokesEntity>) : UIstate()
    class Error(val message: String) : UIstate()
}