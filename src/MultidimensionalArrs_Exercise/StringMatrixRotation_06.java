package MultidimensionalArrs_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputRotation = sc.nextLine();
        int rotation = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputRotation);
        while (matcher.find()){
             rotation = Integer.parseInt(matcher.group());
        }

        List<String> words = new ArrayList<>();
        int maxLength = 0;
        int inpCount = 0;
        String input = sc.nextLine();

        while (!input.equals("END")){
            words.add(input);
            inpCount++;
            if(input.length()>maxLength)
                maxLength=input.length();
            input=sc.nextLine();
        }

        char[][] matrix = new char[inpCount][maxLength];
        for (int row = 0; row < inpCount ; row++) {
            for (int col = 0; col < maxLength ; col++) {
                if (col < words.get(row).length()) {
                    matrix[row][col] = words.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        rotate(rotation,inpCount,maxLength,matrix);
    }
    private static void rotate(int angleRotation, int rows, int cols, char[][] matrix) {
        if (angleRotation == 90) {
            for (int col = 0; col < cols ; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0 ; row--) {
                for (int col = cols - 1; col >= 0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0 ; col--) {
                for (int row = 0; row < rows ; row++) {
                    System.out.print(matrix[row][col]);

                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows ; row++) {
                for (int col = 0; col < cols ; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }
}
