package GenericSwapIntegers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Box> list = new ArrayList<>();
        for(int i=0; i<n;i++){
            Integer num = Integer.parseInt(sc.nextLine());
            Box<Integer> box = new Box<>(num);
            list.add(box);
        }
        String[] swap = sc.nextLine().split(" ");
        int index1 = Integer.parseInt(swap[0]);
        int index2 = Integer.parseInt(swap[1]);
        Box.swap(list,index1,index2);
        for(Box box:list){
            System.out.println(box);
        }
    }
}
