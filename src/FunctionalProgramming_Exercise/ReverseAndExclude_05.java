package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());
        Predicate<Integer> isDivisible = x->x%n!=0;
        Collections.reverse(nums);
        nums.stream().filter(x->isDivisible.test(x))
                .forEach(x->System.out.print(x+" "));
    }
}
