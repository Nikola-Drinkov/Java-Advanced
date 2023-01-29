package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> dividers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> check = x->{
            boolean valid = true;
            for(int divider:dividers){
                if (x % divider != 0) {
                    valid = false;
                    break;
                }
            }
            return valid;
        };
        IntStream.rangeClosed(1,n).filter(x->check.test(x)).forEach(x-> System.out.print(x+" "));
    }
}
