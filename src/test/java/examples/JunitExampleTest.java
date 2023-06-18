package examples;

import org.junit.jupiter.api.*;


public class JunitExampleTest {
    @Test
    public void firstTest() {
        System.out.println("firstTest uruchomiony");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("this will be run AFTER EACH test");
    }
}
