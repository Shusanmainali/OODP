package Workshop4;

class AgeException extends Exception {
    public AgeException(String msg) { super(msg); }
}

class SalaryException extends Exception {
    public SalaryException(String msg) { super(msg); }
}

public class Q23 {
    static void validate(int age, int salary) throws AgeException, SalaryException {
        if (age < 18) throw new AgeException("Age too low");
        if (salary < 10000) throw new SalaryException("Salary too low");
    }

    public static void main(String[] args) {
        try {
            validate(15, 8000);
        } catch (AgeException | SalaryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

