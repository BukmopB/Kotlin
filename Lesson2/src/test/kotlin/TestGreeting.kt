import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class TestGreeting {
    @Test
    fun testBlankName() {
        val e = assertThrows<IllegalArgumentException> { greet("", "") }
    }

    @Test
    fun testFormatList() {
        assertEquals("[Dima, Max, Sveta]", formatList(listOf("Dima", "Max", "Sveta"), "[", "]", ", "))
    }
}