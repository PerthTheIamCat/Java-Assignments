package HW1Invoice;
/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Customer {
    /* Attribute */ 
    private String id;
    private String firstName;
    private String lastName;
    /* Constructor */
    public Customer(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /* Method */
    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
