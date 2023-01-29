package FunctionalProgramming_Exercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparator<Integer> comparator = ((x1,x2)->{
            if(x1%2!=0&&x2%2==0){
                return 1;
            } else if (x1%2==0&&x2%2!=0) {
                return -1;
            }
            else return x1.compareTo(x2);
        });
        List<Integer> nums = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        nums.stream().sorted(comparator).forEach(num-> System.out.print(num+" "));
    }
}
