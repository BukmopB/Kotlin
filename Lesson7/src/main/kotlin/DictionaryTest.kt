import com.google.gson.Gson
import dictionary.DictionaryResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit = Retrofit.Builder()
    .baseUrl("https://dictionary.yandex.net")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service = retrofit.create(DictionaryService::class.java)


fun main()
{
    val result = service.translate("en-ru", "collaboration" )

    val response = result.execute()




//    result.enqueue(object : Callback<DictionaryResult> {
//        override fun onFailure(call: Call<DictionaryResult>, t: Throwable) {
//            TODO("Not yet implemented")
//        }
//
//        override fun onResponse(call: Call<DictionaryResult>, response: Response<DictionaryResult>) {
//            TODO("Not yet implemented")
//        }
//
//    })

    if(response.isSuccessful)
    {
        println(
            response.body()?.def?.get(0)?.tr?.get(0)?.text
        )

        println(
            Gson().toJson(response.body())

        )

    }
    else {
        println(
            response.message()
        )

    }

}