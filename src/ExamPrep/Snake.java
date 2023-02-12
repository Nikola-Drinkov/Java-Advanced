package ExamPrep;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] field = new char[n][n];
        fillMatrix(field,sc);

        int foodCount = 0;
        int rowSnake = -1;
        int colSnake = -1;
        int rowFirstB = -1;
        int colFirstB = -1;
        int rowSecondB = -1;
        int colSecondB = -1;

        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                char position = field[i][j];
                if(position=='S'){
                    rowSnake = i;
                    colSnake = j;
                }
                if(position=='B'&&rowFirstB> -1){
                    rowSecondB=i;
                    colSecondB=j;
                }
                else if(position=='B'){
                    rowFirstB=i;
                    colFirstB=j;
                }
            }
        }

        while (foodCount<10){
            field[rowSnake][colSnake] = '.';
            String command = sc.nextLine();
            switch (command) {
                case "up": rowSnake--; break;
                case "down": rowSnake++; break;
                case "left": colSnake--; break;
                case "right": colSnake++; break;
            }
            if(rowSnake<0||rowSnake>n-1||colSnake<0||colSnake>n-1){
                System.out.println("Game over!");
                break;
            }
            else {
                char currentPos = field[rowSnake][colSnake];
                if(currentPos=='*'){
                    foodCount++;
                }
                else if(currentPos=='B'){
                    field[rowSnake][colSnake]='.';
                    if(rowSnake==rowFirstB&&colSnake==colFirstB){
                        rowSnake = rowSecondB;
                        colSnake = colSecondB;
                    }
                    else{
                        rowSnake = rowFirstB;
                        colSnake = colFirstB;
                    }
                }
                field[rowSnake][colSnake]='S';
            }
        }
        if(foodCount>=10){
            System.out.println("You won! You fed the snake.");
        }
        System.out.println("Food eaten: "+foodCount);
        printMatrix(field);

    }
    public static void fillMatrix(char[][] field, Scanner sc){
        for(int i=0; i<field.length; i++){
            field[i] = sc.nextLine().toCharArray();
        }
    }
    public static void printMatrix(char[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
