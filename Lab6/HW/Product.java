package Homework;
/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Product {
    /* Attribute */ 
    private String id;
    private String name;
    private double price;
    /* Constructor */
    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        setPrice(price);
    }
    /* Method */
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}
