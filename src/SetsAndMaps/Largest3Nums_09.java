package SetsAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Nums_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sorted = nums.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
        if(sorted.size()>=3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(sorted.get(i) + " ");
            }
        }
        else{
            for (int num:sorted){
                System.out.print(num+" ");
            }
        }
    }
}
