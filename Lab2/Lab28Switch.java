/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class Lab28Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday) : ");
        String dateFull = sc.nextLine();
        String dateBrev = "";

        switch (dateFull) {
            case "Monday":
                dateBrev = "MON";
                break;
            case "Tuesday":
                dateBrev = "TUE";
                break;
            case "Wednesday":
                dateBrev = "WED";
                break;
            case "Thursday":
                dateBrev = "THU";
                break;
            case "Friday":
                dateBrev = "FRI";
                break;
            case "Saturday":
                dateBrev = "SAT";
                break;
            case "Sunday":
                dateBrev = "SUN";
                break;
            default:
                dateBrev = "-Invalid-";
                break;
        }
        System.out.println("The abbreviation of " + dateFull + " is " + dateBrev + ".");
        sc.close();
    }
}