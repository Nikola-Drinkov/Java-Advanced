package MultidimensionalArrs_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String carNumber = sc.nextLine();
        String [][] route = new String[n][n];
        fillMatrix(route,sc);

        int distance = 0;
        boolean reachedFinish=false;

        List<Integer> tunnelsList = new ArrayList<>();
        findTunnels(route,tunnelsList);

        String input = sc.nextLine();
        int currentRow = 0;
        int currentCol = 0;
        while (!input.equals("End")){
            switch (input){
                case"left":
                    currentCol--;
                    break;
                case"right":
                    currentCol++;
                    break;
                case"up":
                    currentRow--;
                    break;
                case"down":
                    currentRow++;
                    break;
            }
            String movedPlace = route[currentRow][currentCol];
            if(movedPlace.equals(".")){
                distance+=10;
            }
            else if(movedPlace.equals("T")){
                route[currentRow][currentCol]=".";
                currentRow=tunnelsList.get(2);
                currentCol=tunnelsList.get(3);
                route[currentRow][currentCol]=".";
                distance+=30;
            }
            else if(movedPlace.equals("F")){
                reachedFinish=true;
                distance+=10;
                System.out.printf("Racing car %s finished the stage!%n",carNumber);
                break;
            }
            input = sc.nextLine();
        }

        route[currentRow][currentCol]="C";
        if(!reachedFinish){
            System.out.printf("Racing car %s DNF.%n",carNumber);
        }
        System.out.printf("Distance covered %d km.%n",distance);
        printMatrix(route);
    }
    public static void fillMatrix(String[][] matrix, Scanner sc){
        for(int row=0; row<matrix.length; row++){
            matrix[row] = sc.nextLine().split(" ");
        }
    }
    public static void findTunnels(String[][] matrix, List<Integer> tunnelsList){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                if(matrix[row][col].equals("T")) {
                    tunnelsList.add(row);
                    tunnelsList.add(col);
                }
            }
        }
    }
    public static void printMatrix(String[][] matrix){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
