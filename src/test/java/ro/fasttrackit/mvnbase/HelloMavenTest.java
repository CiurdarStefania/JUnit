package ro.fasttrackit.mvnbase;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Test for Hello M")
class HelloMavenTest {
@Test
    @DisplayName("whrn call")
    public void when(){
    //
    var helloMaven = new HelloMaven();
    //
    var result = helloMaven.sayHello();
    //
    assertNotNull(result);
    assertEquals("Hello maven", result);
    assertTrue(result.equals("Hello Maven"));
    assertThat(result).isEqualTo("Hello Maven");
}

    private void assertEquals(String hello_maven, String result) {
    }

    private void assertTrue(boolean hello_maven) {
    }

    private void assertEquals() {
    }

    private void assertNotNull(String result) {
    }
}
