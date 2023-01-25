package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(", ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());
        nums.removeIf(e->e%2!=0);
        print(nums);
        System.out.println();
        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());
        print(sorted);

    }
    public static void print(List<Integer> nums){
        for(int i=0; i<nums.size(); i++){
                System.out.print(nums.get(i));
            if(i<nums.size()-1)
                System.out.print(", ");
        }
    }
}
