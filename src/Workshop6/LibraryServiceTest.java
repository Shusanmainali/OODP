package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class LibraryServiceTest {

    static LibraryService library;

    @BeforeAll
    static void init() {
        library = new LibraryService();
    }

    @BeforeEach
    void setup() {
        library.addBook("Java");
    }

    @Test
    void testSearchBook() {
        assertTrue(library.searchBook("Java"));
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test done");
    }

    @AfterAll
    static void destroy() {
        library = null;
    }
}

