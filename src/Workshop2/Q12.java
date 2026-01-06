package Workshop2;


interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from B");
    }
}

class C implements A, B {
    public void show() {
        A.super.show();  // or B.super.show();
    }
}


public class Q12 {
	  public static void main(String[] args) {
	        C obj = new C();
	        obj.show();
	    }
}
