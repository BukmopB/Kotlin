import org.junit.jupiter.api.Test
import org.junit.Assert.*

class GreetingTest {
    @Test
    fun testAn2() {
        assertEquals("Hello, An 2!", greeting("An", "2"))
    }

    @Test
    fun testJapaneseSalary() {
        assertEquals(100_000, japaneseSalary(50_000, 5))
    }

    @Test
    fun test15ToInt15() {
        assertEquals("Int 15", printAny(15))
    }

    @Test
    fun test123ToString123() {
        assertEquals("String 123", printAny("123"))
    }

    @Test
    fun testAny() {
        assertEquals("Any 3.14", printAny(3.14f))
    }

    @Test
    fun testFizzBuzz() {
        assertEquals("fizz", fizzBuzz(3))
        assertEquals("buzz", fizzBuzz(5))
        assertEquals("fizzbuzz", fizzBuzz(15))
        assertEquals("", fizzBuzz(2))
    }
}