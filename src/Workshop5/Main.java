package Workshop5;

public class Main {
    public static void main(String[] args) {

        Payment payment = new EsewaPayment();
        PaymentService service = new PaymentService(payment);

        service.checkout(1000);
    }
}

