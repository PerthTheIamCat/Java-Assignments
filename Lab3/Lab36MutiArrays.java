public class Lab36MutiArrays {
    public static void main(String[] args) {
        int[][] MatrixA = {
            {90, 5, 12, -3},
            {-8, 15, -7, 52},
            {0, 23, -8, 1}
        };
        System.out.println("Matrix A is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(MatrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
