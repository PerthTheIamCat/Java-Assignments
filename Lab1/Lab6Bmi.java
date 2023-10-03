/*
 * Written by Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class Lab6Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input1 Mass: ");
        double massKilogram = sc.nextInt();
        System.out.print("Input2 Height: ");
        double heightCentimeter = sc.nextInt();
        double heightMeter = heightCentimeter / 100;
        double bmi = massKilogram / (heightMeter * heightMeter);
        System.out.printf("Output BMI: %.6f", bmi);
    }
}
