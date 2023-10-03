public class GeometricObject {
    // Attribute
    private String color;
    private Boolean filled;
    // Constructor
    public GeometricObject(){
        this("White", false);
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    // Method
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "Color: "  + color + ",isFilled: " + filled;
    }
}
