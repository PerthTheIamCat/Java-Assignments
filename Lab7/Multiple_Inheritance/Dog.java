public class Dog implements CanBark{
    // Attribute
    private String name;

    // Constructor
    public Dog(){
        this(null);
    }
    public Dog(String name){
        this.name = name;
    }

    // Method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void bark() {
        System.out.println("Woof Woof");
    }
}
