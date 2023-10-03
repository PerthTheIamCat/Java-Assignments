public class Lab101Exception {
    public static void main(String[] args) {
        int ans = MathDevider1.divider(10, 0);
        System.out.println(ans);
    }
}
class MathDevider1 {
    public static int divider(int num1, int num2) {
        int result = (int) (num1/num2);
        return result;
    }
}