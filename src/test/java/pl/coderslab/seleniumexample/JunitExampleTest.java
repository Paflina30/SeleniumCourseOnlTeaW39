package pl.coderslab.seleniumexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
