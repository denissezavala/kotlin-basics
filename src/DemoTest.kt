import org.junit.Test
import kotlin.test.assertEquals

class DemoTest {

    @Test
    fun test() {
        assertEquals(8, sum(3, 5))
        assertEquals(8, sameSum(3, 5))
        printSum(3, 5)
    }
}