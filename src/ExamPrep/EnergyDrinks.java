package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] d = Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> milligrams = new ArrayDeque<>();
        ArrayDeque<Integer> drinks = new ArrayDeque<>();
        for(int mg:m){
            milligrams.push(mg);
        }
        for(int drink:d){
            drinks.offer(drink);
        }
        int totalCaff = 0;
        while (!milligrams.isEmpty()&&!drinks.isEmpty()){
            int limit = 300-totalCaff;
            int currentSum = 0;
            int currentMg = milligrams.peek();
            int currentDrink = drinks.peek();
            currentSum = currentMg*currentDrink;
            if(currentSum<=limit){
                totalCaff+=currentSum;
                milligrams.pop();
                drinks.poll();
            }
            else{
                milligrams.pop();
                drinks.offer(drinks.poll());
                if(totalCaff-30>=0) {
                    totalCaff -= 30;
                }
            }
        }
        if(!drinks.isEmpty()){
            System.out.print("Drinks left: ");
            while (!drinks.isEmpty()){
                if(drinks.size()==1){
                    System.out.println(drinks.pop());
                }
                else{
                    System.out.print(drinks.pop()+", ");
                }
            }
        }
        else{
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n",totalCaff);
    }
}
