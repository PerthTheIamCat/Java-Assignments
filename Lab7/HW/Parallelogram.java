/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Parallelogram extends Quadrilateral{
    /* Attribute */
    private double area;

    /* Constructor */
    public Parallelogram(Point bottomLeft, Point topLeft, Point topRigth, Point bottomRigth){
        super(bottomLeft, topLeft, topRigth, bottomRigth);
    }

    /* Method */
    @Override
    public double getArea() {
        // area = ความยาวฐานทั้งหมด * สูง
        area = FindSide.getBase(getEndpoint(0), getEndpoint(2)) * FindSide.getHeight(getEndpoint(2), getEndpoint(3));
        return area;
    }
}
