import java.util.Scanner;

public class Lab33Arrays {
    public static void main(String[] args) {
        int n, i;
        int max = 0;
        int min = 100;
        System.out.print("Input numbers if student: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int[] score = new int[n];

        for (i = 0; i<score.length; i++) {
            System.out.printf("Input score of student{%d}: ", i);
            score[i] = scan.nextInt();
            
            if(score[i] > 100){
                System.out.println("Incorrect value > 100");
                i--;
                continue;
            }else if(score[i] < 0){
                System.out.println("Incorrect value < 0");
                i--;
                continue;
            }else{
                if(score[i] >= max){
                    max = score[i];
                }
                if(score[i] <= min){
                    min = score[i];
                }
            }
        }
        System.out.printf("Max is %d. Min is %d", max, min);
        
        scan.close();
    }
}
