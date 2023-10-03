import java.util.Scanner;

public class Lab47RefSquareThem {
    public static void squareThem(AddInt a, AddInt b)
    {
        a.value *= a.value;
        b.value *= b.value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AddInt num1 = new AddInt();
        AddInt num2 = new AddInt();

        System.out.printf("Enter number#1 : ");
        num1.value = scan.nextInt();

        System.out.printf("Enter number#2 : ");
        num2.value = scan.nextInt();

        squareThem(num1, num2);

        System.out.printf("Results are {%d} and {%d}", num1.value, num2.value);
    }
}
