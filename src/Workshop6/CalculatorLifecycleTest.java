package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorLifecycleTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @AfterEach
    void teardown() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests");
    }
}
