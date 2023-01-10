package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!input.equals("print")){
            if(input.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                else{
                    System.out.println("Canceled "+queue.poll());
                }
            }
            else{
                queue.offer(input);
            }
            input=sc.nextLine();
        }
        for(String doc:queue){
            System.out.println(queue.poll());
        }
    }
}
