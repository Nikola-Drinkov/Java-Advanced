package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookWorm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.nextLine();
        List<Character> initialList = new ArrayList<>();
        for(char c:initial.toCharArray()) initialList.add(c);

        int n = Integer.parseInt(sc.nextLine());
        char[][] field = new char[n][n];
        fillMatrix(field,sc);
        System.out.println();

        int rowP = -1;
        int colP = -1;
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                if(field[i][j]=='P'){
                    rowP = i;
                    colP = j;
                }
            }
        }
        field[rowP][colP] = '-';
        String input = sc.nextLine();
        while (!input.equals("end")){
            if(input.equals("up")){
                if(rowP-1<0){
                    if(!initialList.isEmpty()) initialList.remove(initialList.size()-1);
                }
                else{
                    rowP--;
                }
            }
            else if(input.equals("down")){
                if(rowP+1>=field.length){
                    if(!initialList.isEmpty()) initialList.remove(initialList.size()-1);
                }
                else{
                    rowP++;
                }
            }
            else if(input.equals("right")){
                if(colP+1>=field.length){
                    if(!initialList.isEmpty()) initialList.remove(initialList.size()-1);
                }
                else{
                    colP++;
                }
            }
            else if(input.equals("left")){
                if(colP-1<0){
                    if(!initialList.isEmpty()) initialList.remove(initialList.size()-1);
                }
                else{
                    colP--;
                }
            }
            char currentChar = field[rowP][colP];
            if(Character.isLetter(currentChar)){
                initialList.add(currentChar);
                field[rowP][colP] = '-';
            }
            input = sc.nextLine();
        }
        field[rowP][colP] = 'P';
        initialList.forEach(x-> System.out.print(x));
        System.out.println();
        printMatrix(field);
    }
    private static void fillMatrix(char[][] matrix, Scanner sc){
        for(int i=0; i< matrix.length; i++) {
            char[] currentRow = sc.nextLine().toCharArray();
            for (int j = 0; j < matrix.length; j++) {
                if (j < currentRow.length)
                    matrix[i][j] = currentRow[j];
                else
                    matrix[i][j] = '-';
            }
        }
    }
    private static void printMatrix(char[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

