package Workshop4;

class ThrowThrowsDemo {
    static void demoThrow() {
        throw new RuntimeException("Thrown using throw");
    }

    static void demoThrows() throws Exception {
        throw new Exception("Thrown using throws");
    }

    public static void main(String[] args) {
        try {
            demoThrow();
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        try {
            demoThrows();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
