/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class Lab26DoWhile {
    public static void main(String[] args) {
        int lower, upper, sum = 0, a;
        float count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower bound value : ");
        lower = scan.nextInt();
        System.out.print("Enter the upper bound value : ");
        upper = scan.nextInt();
        a = lower;

        do {
            sum += a;
            a++;
            count++;
        } while (a <= upper);
        
        System.out.printf("\nThe sum of %d to %d is %d", lower, upper, sum);
        System.out.printf("\nThe average is %.1f", (sum / count));
        scan.close();
    }
}
