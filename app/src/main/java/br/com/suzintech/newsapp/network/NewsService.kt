package br.com.suzintech.newsapp.network

import br.com.suzintech.newsapp.model.News
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

    @GET("/svc/mostpopular/v2/emailed/1.json?api-key=${Constants.KEY}")
    suspend fun getMostPopularNews(): Response<News>
}