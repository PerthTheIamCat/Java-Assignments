public class MyInterfaceTest {
    public static void main(String[] args) {
        Lab71 test71 = new Lab71();
        test71.m1();
        Lab72 test72 = new Lab72();
        test72.m1();
        Lab74 test74 = new Lab74() {
            @Override
            public void m1() {
                System.out.println("call from D1");
            }
        };
        test74.m1();
        test74.m2();
        Lab75 test75 = new Lab75() {
            @Override
            public void m1() {
                super.m2();
            }
        };
        test75.m1();
        Lab76 text76 = new Lab76() {
            @Override
            public void m1() {
                System.out.println(MyInterface.MAX);
                System.out.println(MAX);
            }
        };
        text76.m1();
    }
}