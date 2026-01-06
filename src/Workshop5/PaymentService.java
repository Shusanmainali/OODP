package Workshop5;

public class PaymentService {

    private Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        payment.pay(amount);
    }
}

