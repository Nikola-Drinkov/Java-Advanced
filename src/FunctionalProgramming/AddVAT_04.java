package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = Arrays.stream(sc.nextLine().split(", ")).map(x->Double.parseDouble(x)).collect(Collectors.toList());
        UnaryOperator<Double> addVAT = value -> value*1.2;
        Consumer<Double> print = x-> System.out.printf("%.2f%n",x);

        System.out.println("Prices with VAT:");
        nums.stream().map(x->addVAT.apply(x))
        .forEach(x-> print.accept(x));
    }
}
