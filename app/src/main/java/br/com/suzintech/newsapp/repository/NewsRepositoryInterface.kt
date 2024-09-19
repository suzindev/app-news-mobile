package br.com.suzintech.newsapp.repository

import br.com.suzintech.newsapp.model.News

interface NewsRepositoryInterface {

    suspend fun fetchAllNews(): News
}