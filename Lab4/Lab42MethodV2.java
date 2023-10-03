public class Lab42MethodV2 {
    public static void printClassV2(String name, int length)
    {
        for (int i = 0; i < length; i++) 
        {
            System.out.print("=");
        }
        System.out.printf(" Class : %s \n", name);
    }

    public static void main(String[] args) {
        printClassV2("Atgument", 25);
    }
}
