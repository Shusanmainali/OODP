package Workshop4;

import java.io.*;

public class Q5 {
    // Checked Exception example
    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
    }

    public static void main(String[] args) {
        // Unchecked Exception example
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Handling checked exception
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
