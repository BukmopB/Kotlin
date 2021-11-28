package weather

import retrofit2.Call
import retrofit2.http.GET
import weather.WeatherResult

// https://www.metaweather.com/api/location/2122265/

interface WeatherService {

    @GET("/api/location/2122265/")
    fun getWeather() : Call<WeatherResult>
}