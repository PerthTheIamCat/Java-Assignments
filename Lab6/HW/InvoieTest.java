package Homework;
/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Random;

public class InvoieTest{
    public static void main(String[] args) {
        /* Customer List */
        Customer[] customer = {
            new Customer("01", "Pawit", "Thongkum"),
            new Customer("02", "DekDee", "TumDee"),
            new Customer("03", "Porpeang", "Kondee")
        };
        /* Create Products */
        Product[] products = {
            new Product("P01", "Bottle of water", 7),
            new Product("P02", "Crisps", 20),
            new Product("P03", "Cake", 199),
            new Product("P04", "InstantFood", 45),
            new Product("P05", "Milk", 15),
            new Product("P06", "Thai milk tea", 35),
            new Product("P07", "Meatball", 5),
            new Product("P08", "Pancake", 20),
            new Product("P09", "Chocolate bar", 20),
            new Product("P10", "Beer", 40)
        };
        /* Create Invoices  */
        Invoice[] invoices = {
            new Invoice("0001", customer[0]),
            new Invoice("0002", customer[1]),
            new Invoice("0003", customer[2])
        };
        /* Processes that Buy random product */
        Random random = new Random(); // Initialize Random Class
        for (int i = 0; i < invoices.length; i++) { // Loop that Can changes invoices
            int noItem = random.nextInt(3,6); // Random no. product 3-5 list
            for (int j = 0; j < noItem; j++) { // Loop that add item to invoices
                invoices[i].addItem(products[random.nextInt(products.length)], random.nextInt(1,3)); // Random product and quantity
            }
        }
        /* Print process */
        for (int i = 0; i < invoices.length; i++) {
            invoices[i].print();
        }
    }
}