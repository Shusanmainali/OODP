package Workshop4;

public class Q16 {
    static void method() throws Exception {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught inside method: " + e);
            throw e; // Rethrow
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
        }
    }
}
