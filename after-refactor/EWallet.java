public class EWallet implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Pembayaran E-Wallet: " + amount);
    }
}