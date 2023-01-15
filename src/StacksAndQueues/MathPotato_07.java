package StacksAndQueues;
import java.util.Collections;
import java.util.PriorityQueue;
import  java.util.Scanner;
public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kids = sc.nextLine().split(" ");
        PriorityQueue<String> queue = new PriorityQueue<>();
        Collections.addAll(queue,kids);
        int n = Integer.parseInt(sc.nextLine());
        int currentSteps = 1;
        while(queue.size()>1){
            for(int i=1; i<n; i++){
                queue.offer(queue.poll());
            }
            if(isPrime(currentSteps)){
                System.out.println("Prime "+queue.peek());
            }
            else{
                System.out.println("Removed "+queue.poll());
            }
            currentSteps++;
        }
        System.out.println("Last is "+queue.poll());
    }
    public static boolean isPrime(int i){
        if(i==1){
            return false;
        }
        for(int j=2; j<i; j++){
            if(i%j==0)
                return false;
        }
        return true;
    }
}