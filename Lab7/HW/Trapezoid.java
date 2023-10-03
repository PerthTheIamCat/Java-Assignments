/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Trapezoid extends Quadrilateral{
    /* Attribute */
    private double area;

    /* Constructor */
    public Trapezoid(Point bottomLeft, Point topLeft, Point topRigth, Point bottomRigth) {
        super(bottomLeft, topLeft, topRigth, bottomRigth);
    }

    /* Method */
    @Override
    public double getArea() {
        // area = 1/2 * ผลบวกความยาวด้าน * สูง
        area = 0.5 * (FindSide.getBase(getEndpoint(1), getEndpoint(2)) + FindSide.getBase(getEndpoint(0), getEndpoint(3))) * FindSide.getHeight(getEndpoint(0), getEndpoint(1));
        return area;
    }   
}