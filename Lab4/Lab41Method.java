public class Lab41Method 
{
    public static void printClass()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("=");
        }
        System.out.print("Class : Fundamental-II \n");
    }
    public static void printUniversity()
    {
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("=");
        }
        System.out.print("University : Kasetsart Sriracha \n");
    }
    public static void main(String[] args) 
    {
        printClass();
        printUniversity();
        printClass();
        printUniversity();
    }
}