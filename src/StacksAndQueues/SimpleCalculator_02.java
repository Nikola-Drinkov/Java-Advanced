package StacksAndQueues;

import java.util.*;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");
        List<String> parts = new ArrayList<>(List.of(tokens));
        Collections.reverse(parts);
        ArrayDeque<String> stack = new ArrayDeque<>();

        for(String part:parts){
            stack.push(part);
        }
        while (stack.size()>1){
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());
            int result = 0;
            switch (op){
                case"+": result=first+second; break;
                case"-": result=first-second; break;
            }
            stack.push(""+result);
        }
        System.out.println(stack.peek());
    }
}
