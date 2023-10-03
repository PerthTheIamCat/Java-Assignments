import java.util.Scanner;

public class Lab1ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter input : ");
        //int input = scan.nextInt();
        //String input = scan.nextLine();
        double input = scan.nextDouble();
        System.out.println("Output : " + input);
        scan.close();
    }    
}