package Workshop4;

class MyCheckedException extends Exception {
    public MyCheckedException(String msg) {
        super(msg);
    }
}

public class Q17 {
    static void validate(int num) throws MyCheckedException {
        if (num < 0) throw new MyCheckedException("Negative number not allowed.");
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (MyCheckedException e) {
            System.out.println("Exception: " + e);
        }
    }
}
