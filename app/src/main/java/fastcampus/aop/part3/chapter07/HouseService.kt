package fastcampus.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/cb6d6be2-138f-486d-84f4-b428b98fa38c")
    fun getHouseList(): Call<HouseDto>
}