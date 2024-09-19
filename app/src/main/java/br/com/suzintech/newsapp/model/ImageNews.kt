package br.com.suzintech.newsapp.model

import com.google.gson.annotations.SerializedName

data class ImageNews(
    val type: String,

    @SerializedName("media-metadata")
    val metadata: List<ImageUrl>
)
