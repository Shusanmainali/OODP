package workshop1;

public class Q12 {
    double width;
    double height;

    public Q12(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [Width=" + width + ", Height=" + height + "]";
    }

    public static void main(String[] args) {
        Q12 r = new Q12(5, 10);
        System.out.println(r);
    }
}
