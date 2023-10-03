/*
 * Written by Pawit Thongkum
 * ID : 6530300970
 */
import java.util.Random;

public class AddRandom {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextDouble(0.0,50.0);
        double b = random.nextDouble(0.0,50.0);
        System.out.println("Sum of "+ a + " + " + b + " = " + (a + b));
        if ((a + b) >= 50) 
        {
            System.out.println("Value = PASS");
        }
        else
        {
            System.out.println("Value = Not PASS");
        }
    }
}
