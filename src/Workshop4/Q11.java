package Workshop4;

public class Q11 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

