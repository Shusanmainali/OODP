package workshop1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double total = qty * price;
        System.out.println("Total cost: " + total);
    }
}

