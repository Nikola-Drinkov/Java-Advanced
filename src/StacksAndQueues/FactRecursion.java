package StacksAndQueues;

import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(getFact(n));
    }
    public static long getFact(int n){
        if(n==1){
            return 1;
        }
        return getFact(n-1)*n;
    }
}
