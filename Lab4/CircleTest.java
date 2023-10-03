public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.setRadius(72.0);
        c1.setColor("Green");
        System.out.println(c1.toString());
        System.out.printf("The circle has Area of %.2f\n\n", c1.getArea());

        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println(c2.toString());
        System.out.printf("The circle has Area of %.2f\n\n", c2.getArea());
    }
}
