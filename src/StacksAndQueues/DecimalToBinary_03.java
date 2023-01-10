package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(sc.nextLine());
        if(n==0){
            System.out.println(0);
        }
        else{
            while(n!=0){
                stack.push(n%2);
                n/=2;
            }
        }
        for (int num:stack){
            System.out.print(stack.pop());
        }
    }
}
