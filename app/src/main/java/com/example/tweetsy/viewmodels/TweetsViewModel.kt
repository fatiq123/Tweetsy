package com.example.tweetsy.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.models.Tweet
import com.example.tweetsy.repository.TweetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TweetsViewModel @Inject constructor(
    private val repository: TweetRepository,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    val tweets: StateFlow<List<Tweet>>
        get() = repository.tweets

    init {
        viewModelScope.launch {
            /*
            we use savedStateHandle to get dynamic behavior of category as NavBackStackEntry uses
            savedStateHandle to store information of screens. And below we are using key of category to get data of screens
            */
            val category = savedStateHandle.get<String>("category") ?: "Motivation"
            repository.getTweets(category = category)
        }
    }

}