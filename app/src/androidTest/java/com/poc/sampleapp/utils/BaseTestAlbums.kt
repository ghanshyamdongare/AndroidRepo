package com.poc.sampleapp.utils

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.poc.sampleapp.data.model.Albums
import org.junit.Rule


abstract class BaseTestAlbums {
    @get:Rule
    var coroutineTestRule = CoroutineRuleTest()

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    val albums = MutableLiveData<List<Albums>>()


    var list = listOf(
        Albums(
            1,
        "this is title 1",
        21
        ),
        Albums(
            2,
            "this is title 1",
            21
        ),
        Albums(
            3,
            "this is title 1",
            21
        ),
        Albums(
            4,
            "this is title 1",
            21
        )
    )


}