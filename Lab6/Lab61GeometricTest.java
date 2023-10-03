public class Lab61GeometricTest {
    public static void main(String[] args) {
        double area = 0.0;

        GeometricObject[] objs = {new Circle(5), new Ractangle(2, 4)};

        for (GeometricObject obj : objs) {
            area += obj.getArea();
        }
        System.out.println("Total area = " + area);
    }
}
