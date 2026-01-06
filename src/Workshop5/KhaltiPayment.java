package Workshop5;

public class KhaltiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Khalti");
    }
}

