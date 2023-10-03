import java.util.Scanner;

public class Lab34String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.printf("There are %d e's in strings", count);

        scan.close();
    }
}
