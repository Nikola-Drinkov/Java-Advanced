package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = sc.nextLine().split(" ");
        Predicate<String> check = name -> name.length()<=n;
        Arrays.stream(names).filter(check).forEach(name-> System.out.println(name));
    }
}
