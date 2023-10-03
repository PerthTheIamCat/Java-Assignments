package HW1Invoice;

public class CashPayment extends Payment{
    /* Attribute */
    private double tendered;

    /* Constructor */
    public CashPayment(double amount, double tendered) {
        super(amount);
        this.tendered = tendered;
    }

    /* Method */
    public double getTendered() {
        return tendered;
    }

    public double getChange() {
        return getTendered() - super.getAmount();
    }
    public String toString() {
        return String.format("Amount: %.2f Tendered: %.2f Change: %.2f\n", super.getAmount(), getTendered(), getChange());
    }
}
