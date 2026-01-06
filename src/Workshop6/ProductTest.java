package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void testProductUsingAssertAll() {
        Product product = new Product("Laptop", 500, 1);

        assertAll(
            () -> assertNotNull(product.name),
            () -> assertTrue(product.price > 0),
            () -> assertTrue(product.isAffordable(600)),
            () -> assertFalse(product.isAffordable(400))
        );
    }
}
}
