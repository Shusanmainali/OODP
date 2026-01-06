package Workshop6;

public class Rectangle1 extends Shape {
    double length, width;

    Rectangle1(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}
