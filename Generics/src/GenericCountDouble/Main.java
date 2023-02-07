package GenericCountDouble;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Box> list = new ArrayList<>();
        for(int i=0; i<n;i++){
            Double num = Double.parseDouble(sc.nextLine());
            Box<Double> box = new Box<>(num);
            list.add(box);
        }
        Box compare = new Box<>(Double.parseDouble(sc.nextLine()));
        int count = 0;
        for(Box el:list){
            int res = el.compareTo(compare);
            if(res>0) count++;
        }
        System.out.println(count);
    }
}
