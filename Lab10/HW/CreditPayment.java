package HW1Invoice;

public class CreditPayment extends Payment{
    /* Attribute */
    private String cardNumber;

    /* Constructor */
    public CreditPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    /* Method */
    public String getCardNumber() {
        return cardNumber;
    }
    public String toString() {
        return String.format("Amount: %.2f Card Number: %s\n", super.getAmount(), getCardNumber());
    }
}
