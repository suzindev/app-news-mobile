package br.com.suzintech.newsapp.repository

import br.com.suzintech.newsapp.model.News
import br.com.suzintech.newsapp.network.NewsApi

class NewsRepository(private val api: NewsApi) : NewsRepositoryInterface {

    override suspend fun fetchAllNews(): News {
        try {
            return api.getApiNews().getMostPopularNews().body()!!
        } catch (e: Exception) {
            throw e
        }
    }
}