package com.example.tweetsy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.models.Tweet
import com.example.tweetsy.repository.TweetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TweetsViewModel @Inject constructor(private val repository: TweetRepository) : ViewModel() {

    val tweets: StateFlow<List<Tweet>>
        get() = repository.tweets

    init {
        viewModelScope.launch {
            repository.getTweets("Motivation")
        }
    }

}