package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bounds = sc.nextLine().split(" ");
        int lower = Integer.parseInt(bounds[0]);
        int upper = Integer.parseInt(bounds[1]);
        String input = sc.nextLine();
        Predicate<Integer> filter = input.equals("odd")? x->x%2!=0:x->x%2==0;
        Consumer<Integer> printer = x-> System.out.print(x+" ");
        IntStream.rangeClosed(lower,upper)
                .filter(e -> filter.test(e))
                .forEach(e -> printer.accept(e));
    }
}
