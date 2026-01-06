package Workshop5;

public class Main4 {
    public static void main(String[] args) {

        // Normal Duck
        Duck duck = new Duck();
        duck.swim();
        duck.quack();

        // Wooden Duck
        Swimmable woodenDuck = new WoodenDuck();
        woodenDuck.swim();

        
    }
}

