package br.com.suzintech.newsapp.model

import com.google.gson.annotations.SerializedName

data class NewsResults(
    val url: String,
    val id: Long,

    @SerializedName("published_date")
    val publishedDate: String,

    val section: String,
    val title: String,
    val media: List<ImageNews>
)
