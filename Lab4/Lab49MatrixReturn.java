import java.util.Scanner;

public class Lab49MatrixReturn {
    static Scanner scan = new Scanner(System.in);

    public static int[][] readMatrix(int row, int columns){
        int[][] matrix = new int[row][columns];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element[%d,%d]: ", i+1, j+1);
                matrix[i][j] = scan.nextInt();

            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix, int row, int columns ){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int numRows, numCols;
        int[][] A;

        System.out.println("How many rows : ");
        numRows = scan.nextInt();

        System.out.println("How many columns :");
        numCols = scan.nextInt();

        A = readMatrix(numRows, numCols);
        System.out.println("Matrix A is");
        showMatrix(A, numRows, numCols);
    }
}
