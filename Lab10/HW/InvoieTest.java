package HW1Invoice;
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
            new Customer("03", "Porpeang", "Kondee"),
            new Customer("04", "Meow", "Zom")
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
            new Invoice("0003", customer[2]),
            new Invoice("0004", customer[3])
        };
        /* Processes that Buy random product */
        Random random = new Random(); // Initialize Random Class
        for (int i = 0; i < invoices.length; i++) { // Loop that Can changes invoices
            int noItem = random.nextInt(3,6); // Random no. product 3-5 list
            for (int j = 0; j < noItem; j++) { // Loop that add item to invoices
                invoices[i].addItem(products[random.nextInt(products.length)], random.nextInt(1,3)); // Random product and quantity
            }
        }

        /* Set Payment for each invoices */
        invoices[0].setPayment(null);
        invoices[1].setPayment(new CashPayment(invoices[1].getTotalPrice(), 1000));
        invoices[2].setPayment(new CreditPayment(invoices[2].getTotalPrice(), "1234567887654321"));
        invoices[3].setPayment(new PlanPayment(invoices[3].getTotalPrice(), 10));
        ((PlanPayment) invoices[3].getPayment()).setInstallment(0, new CashPayment(invoices[3].getTotalPrice()/10, invoices[3].getTotalPrice()/10));
        ((PlanPayment) invoices[3].getPayment()).setInstallment(1, new CreditPayment(invoices[3].getTotalPrice()/10, "1234567887654321"));
        ((PlanPayment) invoices[3].getPayment()).setInstallment(2, new CashPayment(invoices[3].getTotalPrice()/10, invoices[3].getTotalPrice()/10));
        

        /* Print process */
        for (int i = 0; i < invoices.length; i++) {
            invoices[i].print();
        }
    }
}