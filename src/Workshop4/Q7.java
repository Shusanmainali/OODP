package Workshop4;

public class Q7 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index issue: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic issue: " + e);
        } catch (Exception e) {
            System.out.println("Other exception: " + e);
        }
    }
}
