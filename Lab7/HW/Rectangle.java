/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Rectangle extends Quadrilateral{
    /* Attribute */
    private double area;

    /* Constructor */
    public Rectangle(Point bottomLeft, Point topLeft, Point topRigth, Point bottomRigth){
        super(bottomLeft, topLeft, topRigth, bottomRigth);
    }

    /* Method */
    @Override
    public double getArea() {
        // area = กว้าง * ยาว 
        area = FindSide.getHeight(getEndpoint(0), getEndpoint(1)) * FindSide.getBase(getEndpoint(0), getEndpoint(3));
        return area;
    }
}
