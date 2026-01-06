package Workshop5;

public class EsewaPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using eSewa");
    }
}
