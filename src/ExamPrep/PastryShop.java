package ExamPrep;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        final int BISCUIT_VALUE = 25;
        final int CAKE_VALUE = 50;
        final int PASTRY_VALUE = 75;
        final int PIE_VALUE = 100;
        int biscuitCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int pieCount = 0;

        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        ArrayDeque<Integer> ingredients  = new ArrayDeque<>();

        String[] liquidArr = sc.nextLine().split(" ");
        for(String liq:liquidArr){
            liquids.offer(Integer.parseInt(liq));
        }
        String[] ingredientsArr = sc.nextLine().split(" ");
        for(String ingr:ingredientsArr){
            ingredients.push(Integer.parseInt(ingr));
        }
        while(!liquids.isEmpty()&&!ingredients.isEmpty()){
            int currentLiq = liquids.peek();
            int currentIng = ingredients.peek();
            int sum = currentIng+currentLiq;

            if(sum==BISCUIT_VALUE){
                biscuitCount++;
                liquids.poll();
                ingredients.pop();
            }
            else if(sum==CAKE_VALUE){
                cakeCount++;
                liquids.poll();
                ingredients.pop();
            }
            else if(sum==PASTRY_VALUE){
                pastryCount++;
                liquids.poll();
                ingredients.pop();
            }
            else if(sum==PIE_VALUE){
                pieCount++;
                liquids.poll();
                ingredients.pop();
            }
            else{
                liquids.poll();
                ingredients.push(ingredients.pop()+3);
            }
        }
        if(biscuitCount>0&&cakeCount>0&&pastryCount>0&&pieCount>0){
            System.out.println("Great! You succeeded in cooking all the food!");
        }
        else{
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        System.out.print("Liquids left: ");
        if(!liquids.isEmpty()){
            System.out.println(liquids.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
        else{
            System.out.println("none");
        }
        System.out.print("Ingredients left: ");
        if(!ingredients.isEmpty()){
            System.out.println(ingredients.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
        else{
            System.out.println("none");
        }
        System.out.printf("Biscuit: %d%n",biscuitCount);
        System.out.printf("Cake: %d%n",cakeCount);
        System.out.printf("Pie: %d%n",pieCount);
        System.out.printf("Pastry: %d%n",pastryCount);
    }
}
