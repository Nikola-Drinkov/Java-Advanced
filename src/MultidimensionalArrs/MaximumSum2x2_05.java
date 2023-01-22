package MultidimensionalArrs;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int [rows][cols];
        fillMatrix(matrix,rows,cols,sc);

        int maxSum=Integer.MIN_VALUE;
        int topR = 0;
        int topC = 0;
        for(int row=0; row<rows-1; row++) {
            for (int col=0; col<cols-1; col++) {
                int currentSum =    matrix[row][col] + matrix[row][col + 1]+
                        matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum>maxSum) {
                    maxSum = currentSum;
                    topR=row;
                    topC=col;
                }
            }
        }
        System.out.println(matrix[topR][topC]+" "+matrix[topR][topC+1]);
        System.out.println(matrix[topR+1][topC]+" "+matrix[topR+1][topC+1]);
        System.out.println(maxSum);
    }
    public static void fillMatrix(int[][] matrix,int rows, int cols, Scanner sc){
        for(int row=0; row<rows; row++){
            int[]inputTokens = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for(int col=0; col<cols; col++){
                matrix[row][col] = inputTokens[col];
            }
        }
    }
}

