public class Lab64MaxTest {
    public static void main(String[] args) {
        ComparableRectangle rectangle1 = new ComparableRectangle(4, 5); // 20
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 6); // 18
        Ractangle r = (Ractangle)Max.max(rectangle1, rectangle2);
        System.out.println(r.getArea());

        ComparableCircle circle1 = new ComparableCircle(5); // 78.54
        ComparableCircle circle2 = new ComparableCircle(2); // 12.56
        Circle c = (Circle)Max.max(circle1, circle2);
        System.out.println(c.getArea());
    }
}
