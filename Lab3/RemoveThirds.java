/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.ArrayList;

public class RemoveThirds {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(2);
        lst.add(5);
        lst.add(3);
        lst.add(1);
        lst.add(3);
        lst.add(9);
        int i = 0;

        System.out.println(lst);
        System.out.println("RemoveThirds :");
        while (i < lst.size()) {
            if (lst.get(i) % 3 == 0) {
                lst.remove(i);
            } else {
                i += 1;
            }
        }
        System.out.println(lst);
    }
}
