package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Consumer<String> print = x-> System.out.println("Sir "+x);
        Arrays.stream(input).forEach(x-> print.accept(x));
    }
}
