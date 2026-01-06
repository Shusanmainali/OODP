package Workshop4;

import java.io.*;

public class Q21 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}

