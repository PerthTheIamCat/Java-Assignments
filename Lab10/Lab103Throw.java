public class Lab103Throw {
    public static void main(String[] args) throws Exception {
        int ans = MathDevider3.divider(10, 0);
        System.out.println(ans);
    }
}
class MathDevider3 {
    public static int divider(int num1, int num2) throws Exception {
        int result = 0;
        try {
            result = (int) (num1/chechZero(num2));
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    public static int chechZero(int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Zero Zero");
        } else {
            return num2;
        }
    }
}