package fastcampus.aop.part4.chapter02.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/e1321f17-0127-49dd-af8e-961bdc122a90")
    fun listMusics() : Call<MusicDto>
}