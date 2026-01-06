package workshop1;

public class Q4 {
    public static void main(String[] args) {
        double a = 5, b = 6, c = 7;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle: " + area);
    }
}
