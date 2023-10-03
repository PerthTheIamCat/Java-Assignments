public class Lab62GeametrocTest {
    public static void main(String[] args) {
        //double area = 0.0;

        GeometricObject[] objs = {new Circle(5), new Ractangle(2, 4)};

        for (GeometricObject obj : objs) {
            if (obj instanceof Circle) {
                Circle c1 = (Circle) obj;

                double diameter = c1.getDiameter();
                System.out.println("Diamater of circle = " + diameter);
            }
        }
    }
}
