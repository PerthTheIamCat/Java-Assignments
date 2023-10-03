import java.util.Scanner;

public class Lab3ForLoop {
    public static void main(String[] args) {
        int i, N;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            N = scan.nextInt();
        }
        for (i = 7; i <= N; i+=7) {
            System.out.println(i);
        }
    }
}
