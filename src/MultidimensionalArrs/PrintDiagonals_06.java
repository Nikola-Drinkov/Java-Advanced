package MultidimensionalArrs;

import java.util.Scanner;

public class PrintDiagonals_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrix(matrix,sc);
        getPrimary(matrix);
        getSecondary(matrix);
    }
    public static void getPrimary(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                if(i==j){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void getSecondary(int[][] matrix){
        for (int i=matrix.length-1; i>=0; i--){
            for(int j=matrix.length-1; j>=0; j--){
                if(j==matrix.length-i-1) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    public static void fillMatrix(int[][] matrix, Scanner sc){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

    }
}
