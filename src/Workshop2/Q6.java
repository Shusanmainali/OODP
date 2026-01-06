package Workshop2;


class Vehicle3 {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car2 extends Vehicle3 {
    @Override
    void start() {
        super.start();
        System.out.println("Car started.");
    }
}

public class Q6 {

    public static void main(String[] args) {
        Car2 car = new Car2();
        car.start();
    }
}
