package br.com.suzintech.newsapp.model

import com.google.gson.annotations.SerializedName

data class News(
    val status: String,

    @SerializedName("num_results")
    val numResult: Int,

    val results: List<NewsResults>
)