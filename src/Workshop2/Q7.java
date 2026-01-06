package Workshop2;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4, width = 6;

    double area() {
        return length * width;
    }
}

public class Q7 {
	  public static void main(String[] args) {
	        Shape circle = new Circle();
	        Shape rectangle = new Rectangle();

	        System.out.println("Circle Area: " + circle.area());
	        System.out.println("Rectangle Area: " + rectangle.area());
	    }
}
