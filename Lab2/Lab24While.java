import java.util.Scanner;

public class Lab24While {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();

        /*
        i = N; // (A)
        while (i >= 1) { // (B)
        System.out.println(i);
        i--; // (C)
        }
        */
        i = N; // (A)
        while (i >= 1) { // (B)
            if (i % 2 == 0) { // (C)
                System.out.println(i);
            }
            i--; // (D)
        }
        scan.close();
    }
}
