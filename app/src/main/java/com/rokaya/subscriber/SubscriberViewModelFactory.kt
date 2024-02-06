package com.rokaya.subscriber

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rokaya.subscriber.db.SubscriberRepository
import java.lang.IllegalArgumentException

class SubscriberViewModelFactory (private val repository: SubscriberRepository) : ViewModelProvider.Factory  {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SubscriberViewModel::class.java)){
            return SubscriberViewModel(repository) as T
        }
        throw IllegalArgumentException("Unkown View Model class")
    }
}