package Workshop2;

abstract class Appliance {
    void turnOn() {
        System.out.println("Appliance turned on.");
    }

    abstract void operate();
}

class WashingMachine extends Appliance {
    void operate() {
        System.out.println("Washing clothes.");
    }
}

public class Q8 {
	public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.operate();
    }
}
