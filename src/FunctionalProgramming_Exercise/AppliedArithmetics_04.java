package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> add = list -> list.stream().map(x->x+=1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> multiply = list -> list.stream().map(x->x*=2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> subtract = list -> list.stream().map(x->x-=1).collect(Collectors.toList());
        Consumer<Integer> print = n->System.out.print(n+" ");

        String input=sc.nextLine();
        while (!input.equals("end")){
            switch (input){
                case"add":{
                    nums=add.apply(nums);
                    break;
                }
                case"multiply":
                    nums=multiply.apply(nums);
                    break;
                case"subtract":
                    nums=subtract.apply(nums);
                    break;
                case"print":
                    nums.forEach(x->print.accept(x));
                    System.out.println();
                    break;
            }
            input=sc.nextLine();
        }
    }
}
