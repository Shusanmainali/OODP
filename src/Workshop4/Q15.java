package Workshop4;

public class Q15 {
    static void method1() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }
    }
}
