package weather

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit = Retrofit.Builder()
    .baseUrl("https://www.metaweather.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service = retrofit.create(WeatherService::class.java)

fun main() {
    val result = service.getWeather()

    val response = result.execute()

    if (response.isSuccessful) {
        println(
            response.body()?.consolidatedWeather?.get(1)?.maxTemp
        )
    } else {
        println(response.message())
    }
}