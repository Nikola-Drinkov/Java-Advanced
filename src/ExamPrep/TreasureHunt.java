package ExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[][] field = new String[n][m];
        fillMatrix(field,n,m,sc);

        int rowY = -1;
        int colY = -1;
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(field[i][j].equals("Y")){
                    rowY = i;
                    colY = j;
                }
            }
        }

        List<String> commands = new ArrayList<>();
        boolean found = false;

        String input = sc.nextLine();
        while (!input.equals("Finish")){
            if (input.equals("up")){
                if(rowY-1>=0){
                    rowY--;
                    if(field[rowY][colY].equals("T")){
                        rowY++;
                    }
                    else commands.add(input);
                }
            }
            else if(input.equals("down")){
                if(rowY+1<n){
                    rowY++;
                    if(field[rowY][colY].equals("T")){
                        rowY--;
                    }
                    else commands.add(input);
                }
            }
            else if(input.equals("left")){
                if(colY-1>=0){
                    colY--;
                    if(field[rowY][colY].equals("T")){
                        colY++;
                    }
                    else commands.add(input);
                }
            }
            else if(input.equals("right")){
                if(colY+1<m){
                    colY++;
                    if(field[rowY][colY].equals("T")){
                        colY--;
                    }
                    else commands.add(input);
                }
            }
            if(field[rowY][colY].equals("X")){
                found = true;
                break;
            }
            input = sc.nextLine();
        }
        if(found){
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            if(!commands.isEmpty()) {
                System.out.println(String.join(", ", commands));
            }
        }
        else{
            System.out.println("The map is fake!");
        }
    }
    public static void fillMatrix(String[][] matrix,int rows, int cols, Scanner sc){
        for(int row=0; row<rows; row++){
            String[] curRow = sc.nextLine().split(" ");
            for(int col=0; col<cols; col++){
                if (col < curRow.length) {
                    matrix[row][col] = curRow[col];
                } else {
                    matrix[row][col] = "-";
                }
            }
        }
    }
}
