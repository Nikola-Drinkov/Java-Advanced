package MultidimensionalArrs_Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tokens = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsIn = tokens[0];
        int colsIn = tokens[1];
        String [][] matrix = new String[rowsIn][colsIn];
        char startLet = 'a';
        for(int rows=0; rows<rowsIn; rows++){
            for(int cols=0; cols<colsIn; cols++){
                String toPut = "" + startLet + (char)(startLet+cols) + startLet;
                matrix[rows][cols] = toPut;
            }
            startLet++;
        }
        printMatrix(matrix,rowsIn,colsIn);
    }
    public static void printMatrix(String[][] matrix, int i, int j){
        for(int rows=0; rows<i; rows++){
            for(int cols=0; cols<j;cols++){
                System.out.print(matrix[rows][cols]+" ");
            }
            System.out.println();
        }
    }
}
