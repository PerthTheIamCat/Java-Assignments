import java.util.Scanner;

public class Lab49ArraysReturn {
    static Scanner scan = new Scanner(System.in);
    
    public static int[] readArrayData(int num)
    {
        System.out.println("Please input your data");
        int[] data =new int[num];

        for (int i = 0; i < data.length; i++) {
            System.out.printf("data[%d] = ", i+1);
            data[i] = scan.nextInt();
        }

        return data;
    }

    public static void main(String[] args) {
        int n;

        System.out.print("Numbers of data : ");
        n = scan.nextInt();

        int[] data;
        data = readArrayData(n);

        System.out.print("Your data is ");
        
        for (int i = 0; i < data.length; i++) {
            System.err.printf(" [%d]", data[i]);
        }
    }
}
