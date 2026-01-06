package Workshop4;

public class Q20 {
    static void method() throws Exception {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new Exception("Higher-level exception", e);
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("Cause: " + e.getCause());
        }
    }
}
