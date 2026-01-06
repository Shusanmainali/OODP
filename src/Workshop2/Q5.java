package Workshop2;

class Animal123 {
    Animal123() {
        System.out.println("Animal created");
    }
}

class Dog1 extends Animal123 {
    Dog1() {
        super();
        System.out.println("Dog created");
    }
}


public class Q5 {
	public static void main(String[] args) {
        new Dog1();
    }
}
