package HW1Invoice;

/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.ArrayList;

public class Invoice {
    /* Attribute */ 
    private String id;
    private Customer customer;
    private ArrayList<LineItem> item = new ArrayList<LineItem>();
    private Payment payment = null;
    /* Constructor */
    public Invoice(String id, Customer customer){
        this.id = id;
        this.customer = customer;
    }
    /* Method */
    public void addItem(Product product, int quantity){
        item.add(new LineItem(product, quantity));
    }
    public String getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public LineItem getLineItems(int i) {
        return item.get(i);
    }
    public double getTotalPrice(){
        double totalPrice = 0;
        for (int i = 0; i < item.size(); i++) {
            totalPrice += item.get(i).getTotalPrice();
        }
        return totalPrice;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return this.payment;
    }

    public void print(){
        try {
            System.out.printf("INVOICE: #%s\n", getId());
            System.out.printf("CUSTOMER: %s %s\n\n", getCustomer().getFirstName(), getCustomer().getLastName());
            System.out.printf("ITEM:\n");
            for (int i = 0; i < item.size(); i++) {
                System.out.printf("%d. %s x %d = %.2f\n", i+1, item.get(i).getProduct().getName(), item.get(i).getQuantity(), item.get(i).getTotalPrice());
            }
            System.out.printf("\nTOTAL: %.2f\n\n", getTotalPrice());
            System.out.print("PAYMENT: ");
            if (payment.getClass().isAssignableFrom(CashPayment.class)) {
                System.out.println(">>Cash-Payment<<");
                System.out.println(payment.toString());
            } else if (payment.getClass().isAssignableFrom(CreditPayment.class)) {
                System.out.println(">>Credit-Payment<<");
                System.out.println(payment.toString());
            } else if (payment.getClass().isAssignableFrom(PlanPayment.class)) {
                System.out.println(">>Plan-Payment<<");
                System.out.println(payment.toString());
            }
            System.out.println("-------------------------------------------------------\n");
        } catch (NullPointerException e) {
            System.out.println("-\n-------------------------------------------------------\n");
        }
    }
}
