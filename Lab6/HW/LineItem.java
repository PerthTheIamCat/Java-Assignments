package Homework;
/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class LineItem {
    /* Attribute */ 
    private Product item;
    private int quantity;
    /* Constructor */
    public LineItem(Product product, int quantity){
        this.item = product;
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }
    /* Method */
    public Product getProduct() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        totalPrice += (item.getPrice() * quantity);
        return totalPrice;
    }
}
