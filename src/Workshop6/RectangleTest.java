package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testRectangle() {
        Rectangle r = new Rectangle(5, 4);
        assertEquals(20, r.area());
        assertEquals(18, r.perimeter());
    }
}

