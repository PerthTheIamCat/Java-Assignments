import java.util.Scanner;

public class Lab44MethodV4 {
    public static double calAverage(int[] input){
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%5d", input[i]);
            sum = sum + input[i];
        }
        System.out.println("");
        return (double) (sum/input.length);
    }

    public static int findMax(int[] input){
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n : ");
        n = scan.nextInt();

        int[] input = new int[n];

        for ( i = 0; i < input.length; i++) {
            System.out.printf("Input (%d) = ", i+1);
            input[i] = scan.nextInt();
        }

        System.out.printf("Max is %d", findMax(input));
    }
}
