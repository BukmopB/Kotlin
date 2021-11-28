package exceptions

import java.io.File
import java.io.IOException
import java.lang.Exception

fun main() {
    // C:\Users\student\Downloads\passwd

    // var lines: List<String> ? = null
    val lines =
        try {
            File("C:/Users/student/Downloads/passwd").bufferedReader()
                .use {
                    it.readLines()

                }
        } catch (e: IOException)
        {
            listOf<String>()
        }
        catch (e: Exception) {
            println(e.message)
            listOf<String>()
        } finally {
            println("and finally...")
        }

    lines.forEach {
        println(it)
    }

}

