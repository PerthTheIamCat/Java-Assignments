import java.util.Scanner;

public class Lab23IfClass {
    public static void main(String[] args){
        int age, height; // (A)
        System.out.print("Please input your age : "); // (B)
        Scanner scan_age = new Scanner(System.in); // (C)
        age = scan_age.nextInt(); // (D)
        System.out.print("Please input your height : "); // (E)
        Scanner scan_height = new Scanner(System.in); // (F) 
        height = scan_height.nextInt(); // (G)

        if (age <= 10) { // (H)
            if (height <= 100) { // (I)
                System.out.println("Your ticket price is 0 baht.");
            } else {
                System.out.println("Your ticket price is 890 baht");
            }
        } else {
            System.out.println("Your ticket price us 1190 baht.");
        }
        
        scan_age.close();
        scan_height.close();
    }
}
