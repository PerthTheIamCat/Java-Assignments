/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class Lab25DoWhile {
    public static void main(String[] args){
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();

        i = N;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        } while (i >= 1);
    scan.close();
    }
}
