package Lab05_6530300970.p54;

public class Lab54HidingFields {
    public static void main(String[] args) {
        A x = new B();

        System.out.println("(1)    x.i is " + x.i);
        System.out.println("(2) (B)x.i is " + ((B)x).i);

        System.out.println("(3)    x.j is " + x.j);
        System.out.println("(4) (B)x.j is " + ((B)x).j);

        System.out.println("(5)    x.m1 is " + x.m1());
        System.out.println("(6) (B)x.m1 is " + ((B)x).m1());

        System.out.println("(7)    x.m2 is " + x.m2());
        System.out.println("(8)    x.m3 is " + x.m3());
    }
}
