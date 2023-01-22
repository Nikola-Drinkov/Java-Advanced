package MultidimensionalArrs;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix,rows,cols,sc);
        int sum =0;
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
               sum+=matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
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
