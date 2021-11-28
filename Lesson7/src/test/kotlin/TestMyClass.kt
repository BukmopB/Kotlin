import mymockito.MyClass
import org.junit.*
import org.junit.Assert.*
import org.junit.rules.ExpectedException
import org.mockito.ArgumentCaptor
import org.mockito.ArgumentMatchers
import org.mockito.Captor
import org.mockito.Mockito.*
import java.lang.IllegalArgumentException
import java.util.*

class TestMyClass {

    @Test
    fun testGetUnique()
    {
        val mock : MyClass = mock(MyClass::class.java)
        `when`(mock.getUniqueId()).thenReturn(43)
        assertEquals(43, mock.getUniqueId())
    }

    @Test
    fun testTwoValues()
    {
        val iter = mock(Iterator::class.java) as Iterator<String>
        `when`(iter.next()).thenReturn("Hello").thenReturn("World")

        val result = iter.next() + " " + iter.next()
        assertEquals(result, "Hello World")

    }

    @get:Rule
    var exceptionRule = ExpectedException.none()

    @Test
    fun testThrowAndCatch()
    {
        val mock  = mock(MyClass::class.java)
        `when`(mock.getUniqueId()).thenThrow(IllegalArgumentException("Typo"))
        exceptionRule.expect(IllegalArgumentException::class.java)
        exceptionRule.expectMessage("Typo")
        mock.getUniqueId()
    }

    @Test
    fun testOrderAndNumberOfTimes()
    {
        val mock = mock(MyClass::class.java)
        `when`(mock.getUniqueId()).thenReturn(43)
        val inOrder = inOrder(mock)

        mock.testing(12)
        mock.getUniqueId()
        mock.getUniqueId()

        verify(mock).testing(ArgumentMatchers.eq(12))
        verify(mock, times(2)).getUniqueId()
        verify(mock, atLeastOnce()).getUniqueId()

        verify(mock, never()).someMethod("123")

        verify(mock, atLeast(1)).getUniqueId()
        verify(mock, atMost(10)).getUniqueId()

        inOrder.verify(mock).testing(12)
        inOrder.verify(mock, times(2)).getUniqueId()

        verifyNoMoreInteractions(mock)
    }


    @Captor
    var stringCaptor = ArgumentCaptor.forClass(String::class.java)
    class MockitoHelper
    {
        fun <T> capture(captor: ArgumentCaptor<T>) : T = captor.capture()
    }

    @Test
    fun spyTest()
    {
        var list = LinkedList<String>()
        val spy = spy(list)
        spy.add("hello")
        verify(spy).add(MockitoHelper().capture(stringCaptor))
        assertTrue(stringCaptor.value == "hello")
    }




    @Before
    fun init()
    {
        println("init")
    }

    @After
    fun tearDown()
    {
        println("after")
    }

    companion object {
        @BeforeClass @JvmStatic
        fun beforeAll()
        {
            println("before all")
        }

        @AfterClass @JvmStatic
        fun afterAll()
        {
            println("after all")
        }

    }






}