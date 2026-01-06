package Workshop4;

public class Q12 {
    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executed even with return.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + test());
    }
}

