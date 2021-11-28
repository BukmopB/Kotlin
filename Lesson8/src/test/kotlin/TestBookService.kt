import bookservice.BookService
import bookservice.LendBookManager
import org.junit.*
import org.junit.rules.ExpectedException
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

class TestBookService {

    @Test
    fun calledInStock100() {
        val mock = mock(BookService::class.java)
        `when`(mock.inStock(100)).thenReturn(true)
        val lendBookManager = LendBookManager(mock)
        lendBookManager.checkout(100, 200)
        verify(mock).lend(ArgumentMatchers.eq(100), ArgumentMatchers.eq(200))
    }

    @get:Rule
    var exceptionRule = ExpectedException.none()

    @Test
    fun testThrowIllegal() {
        val mock = mock(BookService::class.java)
        `when`(mock.inStock(200)).thenThrow(IllegalStateException("Book is not available"))
        exceptionRule.expect(IllegalStateException::class.java)
        exceptionRule.expectMessage("Book is not available")
        mock.inStock(200)
    }
}