package MultidimensionalArrs_Exercise;

import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int [rows][cols];
        fillMatrix(matrix,rows,cols,sc);

        int maxSum=Integer.MIN_VALUE;
        int topR = 0;
        int topC = 0;
        for(int row=0; row<rows-2; row++) {
            for (int col=0; col<cols-2; col++) {
                int currentSum =    matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                                    matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                                    matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum>maxSum) {
                    maxSum = currentSum;
                    topR=row;
                    topC=col;
                }
            }
        }
        System.out.println("Sum = "+maxSum);
        System.out.println(matrix[topR][topC]+" "+matrix[topR][topC+1]+" "+matrix[topR][topC+2]);
        System.out.println(matrix[topR+1][topC]+" "+matrix[topR+1][topC+1]+" "+matrix[topR+1][topC+2]);
        System.out.println(matrix[topR+2][topC]+" "+matrix[topR+2][topC+1]+" "+matrix[topR+2][topC+2]);
    }
    public static void fillMatrix(int[][] matrix,int rows, int cols, Scanner sc){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
