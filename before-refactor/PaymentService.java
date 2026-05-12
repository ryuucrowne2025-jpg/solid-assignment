public class PaymentService {

    public void processPayment(String paymentType, double amount) {

        if (amount <= 0) {
            System.out.println("Jumlah pembayaran tidak valid");
            return;
        }

        if (paymentType.equals("CreditCard")) {
            System.out.println("Pembayaran Credit Card");
        }
        else if (paymentType.equals("BankTransfer")) {
            System.out.println("Pembayaran Bank Transfer");
        }
        else if (paymentType.equals("EWallet")) {
            System.out.println("Pembayaran E-Wallet");
        }

        System.out.println("Simpan transaksi");
        System.out.println("Kirim email");
    }
}