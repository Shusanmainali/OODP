package Workshop4;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

public class Q6 {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new NegativeNumberException("Negative number not allowed: " + num);
        } else {
            System.out.println("You entered: " + num);
        }
        sc.close();
    }
}
