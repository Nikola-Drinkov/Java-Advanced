package MultidimensionalArrs_Exercise;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tokens = sc.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        String[][] matrix = new String[rows][cols];
        for(int row = 0; row<rows; row++){
            String[] rowTokens = sc.nextLine().split(" ");
            for(int col=0; col<cols; col++){
                matrix[row][col] = (rowTokens[col]);
            }
        }
        String input = sc.nextLine();
        while (!input.equals("END")){
            String[] inputArr = input.split(" ");
            if(isValid(input,rows,cols)) {
                int row1 = Integer.parseInt(inputArr[1]);
                int col1 = Integer.parseInt(inputArr[2]);
                int row2 = Integer.parseInt(inputArr[3]);
                int col2 = Integer.parseInt(inputArr[4]);
                String numSwap = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = numSwap;
                printMatrix(matrix,rows,cols);
            }
            else{
                System.out.println("Invalid input!");
            }
            input = sc.nextLine();
        }
    }
    public static boolean isValid(String input, int rows, int cols){
        String[] inputArr = input.split(" ");
        if(inputArr.length!=5) return false;
        if(!inputArr[0].equals("swap")) return false;
        int row1 = Integer.parseInt(inputArr[1]);
        int col1 = Integer.parseInt(inputArr[2]);
        int row2 = Integer.parseInt(inputArr[3]);
        int col2 = Integer.parseInt(inputArr[4]);
        if(row1>rows-1||row2>rows-1||col1>cols-1||col2>cols-1) return false;
        return true;
    }
    public static void printMatrix(String[][] matrix, int rows, int cols){
        for(int row=0; row<rows; row++){
            for (int col=0; col<cols; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
