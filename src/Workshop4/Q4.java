package Workshop4;

public class Q4 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
            int[] arr = new int[5];
            arr[10] = 100;  // ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

