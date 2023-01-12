package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kids = sc.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,kids);
        int n = Integer.parseInt(sc.nextLine());
        while(queue.size()>1){
            for(int i=1; i<n; i++){
                queue.offer(queue.poll());
            }
            String removed = queue.poll();
            System.out.println("Removed "+removed);
        }
        System.out.println("Last is "+queue.poll());
    }
}
