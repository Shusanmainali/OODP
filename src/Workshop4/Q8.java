package Workshop4;

public class Q8 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            try {
                arr[10] = 30;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
