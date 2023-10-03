/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public abstract class Quadrilateral {
    /* Attribute */
    private Point[] endpoint;

    /* Constructor */
    public Quadrilateral(Point p0, Point p1, Point p2, Point p3) {
        this.endpoint = new Point[]{p0, p1, p2, p3};
    }
    
    /* Method */
    public double getArea() { // Default return 0.0
        return 0.0;
    }
    public Point getEndpoint(int index) { // Return Point by index that input
        return endpoint[index];
    }
    
}
