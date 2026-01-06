package Workshop4;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input, please enter a number.");
        }
        sc.close();
    }
}

