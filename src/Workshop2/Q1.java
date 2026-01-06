package Workshop2;

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    } 
}

public class Q1{
	public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
