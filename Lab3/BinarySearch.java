/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */
public class BinarySearch {
    public static int binarySearch(int[] lst,int v) {
        int i = 0;
        int j = lst.length;

        while (i < j) {
            int mid = (i+j) / 2;
            if (v < lst[mid]) {
                j = mid;
            } else if (v > lst[mid]){
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Not Found
    }
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 4, 5, 7, 8, 11, 13};
        int[] n = new int[] {5, 13, 10};

        for (int i = 0; i < n.length; i++) {
            int result = binarySearch(data, n[i]);
            System.out.println("Find : " + n[i]);
            if (result == -1){
                System.out.println("This Number Is Not Found\n");
            } else {
                System.out.println("Found The Number, At Index : " + result + "\n");
            }
        }
    }
}
