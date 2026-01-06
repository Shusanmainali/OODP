package workshop1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length: ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area of square: " + area);
    }
}
