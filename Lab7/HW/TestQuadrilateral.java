/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class TestQuadrilateral {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of trapezoid is : " + trapezoid.getArea());

        Parallelogram parallelogram = new Parallelogram(new Point(0, 0), new Point(1, 2), new Point(4, 2), new Point(3, 0));
        System.out.println("Area of parallelogram is : " + parallelogram.getArea());

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
        System.out.println("Area of Rectangle is : " + rectangle.getArea());

        Square square = new Square(new Point(0, 0), new Point(0, 2), new Point(2, 2), new Point(2, 0));
        System.out.println("Area of square is : " + square.getArea());
    }
}
