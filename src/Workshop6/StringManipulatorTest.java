package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    @Test
    void testAllMethods() {
        StringManipulator sm = new StringManipulator();

        assertAll(
            () -> assertEquals("avaJ", sm.reverse("Java")),
            () -> assertEquals("JAVA", sm.toUpperCase("java")),
            () -> assertTrue(sm.isPalindrome("madam")),
            () -> assertEquals(2, sm.countVowels("Java"))
        );
    }
}
