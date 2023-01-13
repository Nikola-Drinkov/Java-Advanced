package MultidimensionalArrs;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingMatrices_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] firstInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstRows = firstInput[0];
        int firstCols = firstInput[1];
        int[][] firstMatrix = new int[firstRows][firstCols];
        for(int rows=0; rows<firstRows; rows++){
            int [] inputTokens = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int cols=0; cols<firstCols; cols++){
                firstMatrix[rows][cols]= inputTokens[cols];
            }
        }
        int [] secondInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondRows = secondInput[0];
        int secondCols = secondInput[1];
        int[][] secondMatrix = new int[secondRows][secondCols];
        for(int rows=0;rows<secondRows;rows++){
            int[] inputTokens = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int cols=0; cols<secondCols;cols++){
                secondMatrix[rows][cols]=inputTokens[cols];
            }
        }
        if(areEqual(firstMatrix,secondMatrix)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    public static boolean areEqual(int[][]firstMatrix,int[][]secondMatrix){
        if(firstMatrix.length!=secondMatrix.length){
            return false;
        }
        for(int rows=0; rows<firstMatrix.length;rows++){
            if(firstMatrix[rows].length!=secondMatrix[rows].length)
                return false;
            for(int cols=0; cols<firstMatrix[rows].length;cols++){
                if(firstMatrix[rows][cols]!=secondMatrix[rows][cols])
                    return false;
            }
        }
        return true;
    }
}
