package Workshop2;

interface Runnable {
    void run();
}

class Car0 implements Runnable {
    public void run() {
        System.out.println("Car is running.");
    }
}

public class Q9 {
	public static void main(String[] args) {
        Car0 car = new Car0();
        car.run();
    }
}
