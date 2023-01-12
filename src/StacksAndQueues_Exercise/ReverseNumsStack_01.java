package StacksAndQueues_Exercise;

import java.util.*;

public class ReverseNumsStack_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        Collections.addAll(list,s);
        ArrayDeque<String> nums = new ArrayDeque<>();
        for(String sos:list){
            nums.push(sos);
        }
        while (!nums.isEmpty()){
            System.out.print(nums.pop()+" ");
        }
    }
}
