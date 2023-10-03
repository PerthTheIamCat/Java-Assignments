public class Ractangle extends GeometricObject {
    // Attribute
    private double width;
    private double height;
    // Constructor
    public Ractangle(){
        this(0.0, 0.0);
    }
    public Ractangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    // Method
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public String toString() {
        return super.toString() + ",width: " + width + ",height: " + height;
    }
}
