package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> people = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split(", ");
            people.put(input[0],Integer.parseInt(input[1]));
        }
        String condition = sc.nextLine();
        int ageLimit = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        Predicate<Integer> filter = getPredicate(condition,ageLimit);
        Consumer<Map.Entry<String, Integer>> print = getConsumer(format);
        people.entrySet().stream()
                .filter(entry -> filter.test(entry.getValue()))
                .forEach(entry -> print.accept(entry));
    }
    private static Predicate<Integer> getPredicate(String condition, int ageLimit){
        if(condition.equals("older")){
            return x -> x>=ageLimit;
        }
        else if(condition.equals("younger")){
            return  x -> x<=ageLimit;
        }
        throw  new RuntimeException();
    }
    private static Consumer<Map.Entry<String, Integer>> getConsumer (String format){
            if(format.equals("name")){
                return e-> System.out.println(e.getKey());
            }
            else if(format.equals("age")){
                return e-> System.out.println(e.getValue());
            }
            return e-> System.out.printf("%s - %d%n",e.getKey(),e.getValue());
    }
}
