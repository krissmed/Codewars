import org.junit.Test
import org.junit.Assert.assertEquals
class HelloWorldTest {
  @Test
  @Throws(Exception::class)
  fun testHelloWorld() {
    assertEquals("hello world!", greet())
  }
}