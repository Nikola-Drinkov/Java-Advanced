package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StickyFingers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] matrix = new String[n][n];
        int rowDillinger = -1;
        int colDillinger = -1;
        int moneyStolen = 0;

        List<String> commands = Arrays.stream(sc.nextLine().split(",")).collect(Collectors.toList());
        fillMatrix(matrix,sc);
        for (int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j].equals("D")){
                    rowDillinger = i;
                    colDillinger = j;
                    matrix[i][j]="+";
                }
            }
        }
        boolean caught = false;
        while(!commands.isEmpty()&&!caught){
            String command = commands.get(0);
            switch(command){
                case"up":
                    if(rowDillinger-1>=0){
                        rowDillinger--;
                    }
                    else{
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"down":
                    if(rowDillinger+1<matrix.length){
                        rowDillinger++;
                    }
                    else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"left":
                    if(colDillinger-1>=0){
                        colDillinger--;
                    }
                    else{
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"right":
                    if(colDillinger+1<matrix.length){
                        colDillinger++;
                    }
                    else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }
            String currentPos = matrix[rowDillinger][colDillinger];
            switch (currentPos){
                case"$":
                    matrix[rowDillinger][colDillinger] = "+";
                    int money = rowDillinger*colDillinger;
                    moneyStolen+=money;
                    System.out.printf("You successfully stole %d$.%n",money);
                    break;
                case"P":
                    System.out.printf("You got caught with %d$, and you are going to jail.%n",moneyStolen);
                    matrix[rowDillinger][colDillinger] = "#";
                    caught=true;
                    break;
            }
            commands.remove(0);
        }
        if(commands.isEmpty()&&!caught){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",moneyStolen);
            matrix[rowDillinger][colDillinger] = "D";
            printMatrix(matrix);
        }
        else {
            printMatrix(matrix);
        }
    }
    public static void fillMatrix(String[][] matrix, Scanner sc){
        for(int row=0; row<matrix.length; row++){
            matrix[row] = sc.nextLine().split(" ");
        }
    }
    public static void printMatrix(String[][] matrix){
        for(int row = 0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
