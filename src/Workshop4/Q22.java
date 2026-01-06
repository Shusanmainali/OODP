package Workshop4;

import java.io.*;

public class Q22 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("notexist.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
