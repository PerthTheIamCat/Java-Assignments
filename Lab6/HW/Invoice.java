package Homework;
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
    public void print(){
        System.out.printf("INVOICE: #%s\n", getId());
        System.out.printf("CUSTOMER: %s %s\n\n", getCustomer().getFirstName(), getCustomer().getLastName());
        System.out.printf("ITEM:\n");
        for (int i = 0; i < item.size(); i++) {
            System.out.printf("%d. %s x %d = %.2f\n", i+1, item.get(i).getProduct().getName(), item.get(i).getQuantity(), item.get(i).getTotalPrice());
        }
        System.out.printf("\nTOTAL: %.2f\n-----------------------------------------------------\n\n", getTotalPrice());
    }
}
