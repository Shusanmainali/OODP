package Workshop6;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static List<Integer> getEvenNumbers(int[] numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evens.add(n);
            }
        }
        return evens;
    }
}
