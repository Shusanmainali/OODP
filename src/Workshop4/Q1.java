package Workshop4;

public class Q1 {
    public static void main(String[] args) {
        // Exception example
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }

        // Error example
        try {
            int[] arr = new int[Integer.MAX_VALUE]; // Will throw OutOfMemoryError
        } catch (Error e) {
            System.out.println("Caught Error: " + e);
        }
    }
}

