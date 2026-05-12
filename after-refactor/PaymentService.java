public class PaymentService {

    private PaymentMethod paymentMethod;
    private ValidationService validationService;
    private TransactionRepository repository;
    private MessageSender sender;

    public PaymentService(
            PaymentMethod paymentMethod,
            ValidationService validationService,
            TransactionRepository repository,
            MessageSender sender) {

        this.paymentMethod = paymentMethod;
        this.validationService = validationService;
        this.repository = repository;
        this.sender = sender;
    }

    public void process(double amount) {

        if (!validationService.validate(amount)) {
            System.out.println("Jumlah tidak valid");
            return;
        }

        paymentMethod.process(amount);
        repository.save();
        sender.send("Pembayaran berhasil");
    }
}