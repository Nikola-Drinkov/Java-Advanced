package ExamPrep;

import java.util.Scanner;

public class NavyBattle_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] battlefield = new String[n][n];
        fillMatrix(battlefield,sc);

        int positionRow = 0;
        int positionCol = 0;
        for(int row=0; row<battlefield.length;row++){
            for(int col=0; col<battlefield.length;col++){
                if(battlefield[row][col].equals("S")){
                    positionRow=row;
                    positionCol=col;
                }
            }
        }
        battlefield[positionRow][positionCol]="-";
        int cruisers = 0;
        int mines = 0;

        while (cruisers<3&&mines<3){

            String command = sc.nextLine();
            switch (command){
                case"up":
                    positionRow--;
                    break;
                case"down":
                    positionRow++;
                    break;
                case"right":
                    positionCol++;
                    break;
                case"left":
                    positionCol--;
                    break;
            }

            if(battlefield[positionRow][positionCol].equals("*")){
                mines++;
                battlefield[positionRow][positionCol]="-";
            }
            else if(battlefield[positionRow][positionCol].equals("C")){
                cruisers++;
                battlefield[positionRow][positionCol]="-";
            }
        }
        if(mines==3){
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n",positionRow,positionCol);
        }
        else{
            System.out.printf("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!%n");
        }
        battlefield[positionRow][positionCol]="S";
        printMatrix(battlefield);
    }
    private static void fillMatrix(String[][] matrix, Scanner sc){
        for(int row=0; row<matrix.length; row++){
            String[] currentRow = sc.nextLine().split("");
            for(int col=0; col<matrix.length; col++){
                matrix[row][col] = currentRow[col];
            }
        }
    }
    private static void printMatrix(String[][] matrix){
        for(int row=0; row<matrix.length;row++){
            for(int col=0; col<matrix.length;col++){
                System.out.print(matrix[row][col]);
                }
            System.out.println();
            }
        }
    }

