package Workshop4;

import java.io.*;

public class Q10 {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

