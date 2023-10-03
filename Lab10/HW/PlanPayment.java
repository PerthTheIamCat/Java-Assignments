package HW1Invoice;

public class PlanPayment extends Payment{
    /* Attribute */
    private Payment[] payments;

    /* Constructor */
    public PlanPayment(double amount, int numberOfInstallments) {
        super(amount);
        this.payments = new Payment[numberOfInstallments];
    }

    /* Method */
    public void setInstallment(int installment, Payment payment) {
        try {
            if (payment.getClass().isAssignableFrom(PlanPayment.class)) {
                new Exception("Can't not be SetInstallment as PlanPayment");
            } else {
                this.payments[installment] = payment;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public Payment getInstallment(int installment) {
        return payments[installment];
    }
    public String toString() {
        String print = (String.format("Amount: %.2f Installment: %d \n\n", super.getAmount(), payments.length));
        try {
            for (int i = 0; i < payments.length; i++) {
                print += "Installment "+ i + ": " + payments[i].toString();
            }
        } catch (Exception e) {
            return print;
        }
        return print;
    }
}
