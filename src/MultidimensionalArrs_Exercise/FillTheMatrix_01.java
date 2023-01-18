package MultidimensionalArrs_Exercise;
import java.util.Scanner;
public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        int[][] matrix = new int[size][size];
        String pattern = input[1];

        int startNum=1;
        if(pattern.equals("A")){
            for(int cols=0; cols<matrix.length; cols++){
                for(int rows=0; rows<matrix.length;rows++){
                    matrix[rows][cols] = startNum;
                    startNum++;
                }
            }
        }
        else if(pattern.equals("B")){
            for(int cols=0; cols<matrix.length; cols++){
                if(cols%2==0) {
                    for (int rows = 0; rows < matrix.length; rows++) {
                        matrix[rows][cols] = startNum;
                        startNum++;
                    }
                }
                else{
                    for(int rows= matrix.length-1;rows>=0; rows--){
                        matrix[rows][cols]=startNum;
                        startNum++;
                    }
                }
            }
        }
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix){
        for(int rows=0; rows<matrix.length; rows++){
            for(int cols=0; cols<matrix.length;cols++){
                System.out.print(matrix[rows][cols]+" ");
            }
            System.out.println();
        }
    }
}
