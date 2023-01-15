package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUp_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> removedStack = new ArrayDeque<>();
        String input = sc.nextLine();
        while(!input.equals("Home")){
            if(input.equals("back")){
                if(stack.isEmpty()||stack.size()==1){
                    System.out.println("no previous URLs");
                }
                else{
                    String removed = stack.pop();
                    removedStack.addFirst(removed);
                    System.out.println(stack.peek());
                }
            }
            else if(input.equals("forward")){
                if(removedStack.isEmpty()){
                    System.out.println("no next URLs");
                }
                else{
                    stack.push(removedStack.pop());
                    System.out.println(stack.peek());
                }
            }
            else{
                stack.push(input);
                System.out.println(stack.peek());
                removedStack.clear();
            }
            input = sc.nextLine();
        }
    }
}
