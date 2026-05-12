public class CreditCard implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Pembayaran Credit Card: " + amount);
    }
}