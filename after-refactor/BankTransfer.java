public class BankTransfer implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Pembayaran Bank Transfer: " + amount);
    }
}