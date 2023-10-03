/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class Square extends Quadrilateral{
    /* Attribute */
    private double area;

    /* Constructor */
    public Square(Point bottomLeft, Point topLeft, Point topRigth, Point bottomRigth){
        super(bottomLeft, topLeft, topRigth, bottomRigth);
    }
    
    /* Method */
    @Override
    public double getArea() {
        // area = กว้าง * ยาว >>> area = ความยาวด้าน^2    //  เนื่องตจาก Square มีความยาวด้านเท่ากันทุกด้าน
        area = Math.pow(FindSide.getBase(getEndpoint(0), getEndpoint(3)), 2);
        return area;
    }
}
