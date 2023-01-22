package MultidimensionalArrs;

import java.util.Scanner;

public class Intersection_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];
        String[][] thirdMatrix = new String[rows][cols];
        fillMatrix(firstMatrix,rows,cols,sc);
        fillMatrix(secondMatrix,rows,cols,sc);
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                }else{
                    thirdMatrix[row][col]="*";
                }
            }
        }
        for(int row=0; row<rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(thirdMatrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void fillMatrix(String[][] matrix,int rows, int cols, Scanner sc){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                matrix[row][col] = sc.next();
            }
        }
    }
}
