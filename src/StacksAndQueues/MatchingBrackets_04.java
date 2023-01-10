package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = sc.nextLine();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='('){
                stack.push(i);
            }
            else if(input.charAt(i)==')'){
                int start = stack.pop();
                String sub = input.substring(start, i+1);
                System.out.println(sub);
            }
        }
    }
}
