package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nums =Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        Function<String, Integer> parser = n -> Integer.parseInt(n);
        Consumer<Integer> consumer = num -> System.out.println("Sum = "+num);
        Consumer<Integer> consumer2 = num -> System.out.println("Count = "+num);
        int sum = 0;
        int count = 0;
        for(String num:nums){
            count++;
            sum+=parser.apply(num);
        }
        consumer2.accept(count);
        consumer.accept(sum);

    }
}
