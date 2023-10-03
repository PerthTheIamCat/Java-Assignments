import java.util.Scanner;

public class Lab22IfClass {
    public static void main(String[] args) {
    Scanner scan_double = new Scanner(System.in);
    Scanner scan_str = new Scanner(System.in);
    String str;
    char member;
    double price;

    System.out.print("Please input your price : ");
    price = scan_double.nextDouble();
    
    System.out.print("Are you my member? : "); // (A)
    str = scan_str.nextLine(); // (B)
    member = str.charAt(0); // (C)
    
    if (member != 'Y') { // (D)
        System.out.printf("\nYour price is %.0f baht. Thank you.", price); // (E)
    } else {
        System.out.printf("\nYour discound is %.0f baht.", (price * 10 / 100)); //  (F)
        price -= (price * 10 / 100); // (G)
        System.out.printf("\nYour price is %.0f baht. Thank you.", price); // (H)
    }
    scan_double.close();
    scan_str.close();
    }
}
