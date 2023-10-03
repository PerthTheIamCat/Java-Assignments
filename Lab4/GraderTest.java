/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Scanner;

public class GraderTest {
    public static void main(String[] args) {
        // ประกาศตัวแปร
        Scanner scan = new Scanner(System.in);
        String name;
        float score;
        int n;

        // รับค่าจากผู้ใช้
        System.out.print("Enter course name: ");
        name = scan.nextLine();
        Grader class1 = new Grader(name);
        System.out.print("Enter number of Students: ");
        n = scan.nextInt();

        // เพิ่มคะแนนตามจำนวนนักเรียน
        System.out.println("\nInput scores");
        for (int i = 0; i < n; i++) {
            score = scan.nextFloat();
            class1.addScores(score);
        }
        scan.nextLine(); // flush return

        // แสดงค่าเฉลี่ย
        System.out.printf("\nMean for %s = %.2f\n", class1.getCourseName(), class1.mean());
        // แสดงจำนวนคนที่มีคะแนนสูงกว่าค่าเฉลี่ย
        System.out.printf("Below mean = %d\n", class1.belowMean());
        // แสดงจำนวนคนที่มีคะแนนต่ำกว่าค่าเฉลี่ย
        System.out.printf("Above mean = %d\n", class1.aboveMean());
        // แสดงจำคนของในแต่ละเกรต
        class1.showGrade();
        System.out.println("####################################\n");

        /*
         * วิชาต่อไป
         */
        // รับค่าจากผู้ใช้
        System.out.print("Enter course name: ");
        name = scan.nextLine();
        Grader class2 = new Grader(name);
        System.out.print("Enter number of Students: ");
        n = scan.nextInt();

        // เพิ่มคะแนนตามจำนวนนักเรียน
        System.out.println("\nInput scores");
        for (int i = 0; i < n; i++) {
            score = scan.nextFloat();
            class2.addScores(score);
        }
        scan.nextLine(); // flush return

        // แสดงค่าเฉลี่ย
        System.out.printf("\nMean for %s = %.2f\n", class2.getCourseName(), class2.mean());
        // แสดงจำนวนคนที่มีคะแนนสูงกว่าค่าเฉลี่ย
        System.out.printf("Below mean = %d\n", class2.belowMean());
        // แสดงจำนวนคนที่มีคะแนนต่ำกว่าค่าเฉลี่ย
        System.out.printf("Above mean = %d\n", class2.aboveMean());
        // แสดงจำคนของในแต่ละเกรต
        class2.showGrade();
        System.out.println("####################################\n");
    }
}
