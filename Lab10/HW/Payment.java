package HW1Invoice;

public abstract class Payment {
    /* Attribute */
    private double amount;

    /* Constructor */
    public Payment(double amount) {
        try {
            if (amount < 0) {
                new Exception("Amount < 0");
            }
            this.amount = amount;
        } catch (Exception e) {
            this.amount = 0;
        }
    }
    
    /* Method */
    public double getAmount() {
        return amount;
    }
}
