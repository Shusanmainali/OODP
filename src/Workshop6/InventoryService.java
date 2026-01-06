package Workshop6;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, Integer> stock = new HashMap<>();

    public InventoryService() {
        stock.put("Pen", 10);
    }

    public boolean isProductAvailable(String product, int qty) {
        return stock.containsKey(product) && stock.get(product) >= qty;
    }
}
