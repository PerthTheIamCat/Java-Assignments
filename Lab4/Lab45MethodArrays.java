public class Lab45MethodArrays {
    public static void showMatrix(int[][] a){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", a[i][j]);
            }
            System.out.println("");
        }
    }
    public static void showAddMatrix(int[][] a, int[][] b){
        int[][] ab = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                ab[i][j] = a[i][j] + b[i][j];
            }
        }
        showMatrix(ab);
    }

    public static void main(String[] args) {
        int[][] A = {
            { -3, 5, 6},
            { 5, 0, -2}
        };
        int[][] B = {
            { 9, 0, -5},
            { -3, -2, -1}
        };
        System.out.println("Matrix A : ");
        showMatrix(A);
        System.out.println("Matrix B : ");
        showMatrix(B);
        System.out.println("Matrix A+B : ");
        showAddMatrix(A, B);
    }
}
