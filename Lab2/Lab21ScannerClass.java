/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class Lab21ScannerClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name, birthday;
        Long id;
        int age;
        float gpa;

        System.out.print("Enter Name : ");
        name = scan.nextLine();
        System.out.print("Enter ID : ");
        id = scan.nextLong();
        scan.nextLine();
        System.out.print("Enter Birthday (dd/mm/yyyy) : ");
        birthday = scan.nextLine();
        System.out.print("Enter Age : ");
        age = scan.nextInt();
        System.out.print("Enter GPA : ");
        gpa = scan.nextFloat();

        System.out.println("\nMy Name is " + name);
        System.out.print("Birthday : " + birthday);
        System.out.println("\tAge : " + age);
        System.out.print("ID : " + id);
        System.out.println("\t\tGPA : " + gpa);
        scan.close();
    }
}
