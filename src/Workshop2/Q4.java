package Workshop2;

interface Flyable {
    void fly();
}

class Animal12 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Eagle extends Animal12 implements Flyable {
    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class Q4 {
	 public static void main(String[] args) {
	        Eagle eagle = new Eagle();
	        eagle.eat();
	        eagle.fly();
	    }
}
