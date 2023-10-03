/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.ArrayList;

public class Lab37ArrayList {
    public static void main(String[] args) {
        ArrayList<String> bandList = new ArrayList<String>();
        
        bandList.add("Paul");
        bandList.add("Pete");
        bandList.add("John");
        bandList.add("George");
        System.out.println(bandList);

        int idx = bandList.indexOf("Pete");
        bandList.remove(idx);
        System.out.println(bandList);
        System.out.println("At index 1 : Ringo");

        bandList.add(idx, "Ringo");
        System.out.println(bandList);
        System.out.println("Edit name John -> Johny\n");
        idx = bandList.indexOf("John");
        bandList.set(idx, "Johny");

        System.out.println("Size of the band : " + bandList.size());
        for (int i = 0; i < bandList.size(); i++) {
            System.out.println(bandList.get(i));
        }
    }
}
