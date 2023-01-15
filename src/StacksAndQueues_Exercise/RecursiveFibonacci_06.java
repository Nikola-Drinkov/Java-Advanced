package StacksAndQueues_Exercise;

import java.util.Scanner;

public class RecursiveFibonacci_06 {
    public static long [] memoryFibonacci;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        memoryFibonacci = new long [n+1];
        System.out.println(getFibonacci(n));
    }
    public static long getFibonacci(int n){
        if(n<=1){
            return 1;
        }
        if(memoryFibonacci[n]!=0){
            return memoryFibonacci[n];
        }
        return memoryFibonacci[n] = getFibonacci(n-1)+getFibonacci(n-2);
    }
}
