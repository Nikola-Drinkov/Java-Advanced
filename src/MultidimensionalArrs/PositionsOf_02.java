package MultidimensionalArrs;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [][] matrix = new int[input[0]][input[1]];
        for(int rows = 0; rows<input[0];rows++){
            int[] currentRow =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int cols = 0; cols<input[1];cols++){
                matrix[rows][cols] = currentRow[cols];
            }
        }
        boolean isFound = false;
        int num = Integer.parseInt(sc.nextLine());
        for(int rows=0; rows<input[0];rows++){
            for(int cols=0; cols<input[1];cols++){
                if(matrix[rows][cols]==num) {
                    System.out.println(rows + " " + cols);
                    isFound=true;
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }
    }
}
