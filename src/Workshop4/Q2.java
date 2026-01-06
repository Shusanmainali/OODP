package Workshop4;

public class Q2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}

