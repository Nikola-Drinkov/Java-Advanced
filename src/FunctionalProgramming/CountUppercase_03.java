package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercase_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        Predicate<String> isUpper = x->Character.isUpperCase(x.charAt(0));
        List<String> uppercase = words.stream().filter(w->isUpper.test(w))
                .collect(Collectors.toList());
        Consumer<String> print = x-> System.out.println(x);
        System.out.println(uppercase.size());
        uppercase.forEach(x->print.accept(x));
        }
    }
