package Workshop4;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.println("Result: " + (100 / num));
        } catch (ArithmeticException e) {
            System.out.println("Handled division by zero.");
        } catch (Exception e) {
            System.out.println("Other error: " + e);
        }
        System.out.println("Program continues without crashing!");
        sc.close();
    }
}
