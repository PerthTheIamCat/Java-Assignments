/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
public class FindSide {
    /* Attribute */
    public static double side;

    /* Method */
    //ใช้ FindSide เพื่อหาความยาวในแต่ละด้านจากระยะห่างของพิกัด 2 จุด

    // Find height
    public static double getHeight(Point a, Point b) {
        side = a.getY() - b.getY();
        return Math.abs(side);
    }
    // Find base
    public static double getBase(Point a, Point b) {
        side = a.getX() - b.getX();
        return Math.abs(side);
    }
}
