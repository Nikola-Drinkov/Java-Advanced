package MultidimensionalArrs_Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrix(matrix,sc);

    }
    public static void fillMatrix (int[][]matrix, Scanner sc){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        int diff = Math.abs(getPrimarySum(matrix)-getSecondarySum(matrix));
        System.out.println(diff);
    }
    public static int getPrimarySum(int[][] matrix){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int getSecondarySum(int[][] matrix){
        int sum=0;
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(j==matrix.length-i-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
