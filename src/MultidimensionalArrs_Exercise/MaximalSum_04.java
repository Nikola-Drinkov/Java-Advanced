package MultidimensionalArrs_Exercise;

import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int [rows][cols];
        fillMatrix(matrix,rows,cols,sc);
    }
    public static void fillMatrix(int[][] matrix,int rows, int cols, Scanner sc){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
