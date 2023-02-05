package ExamPrep;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] m = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double [] c = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();
        TreeMap<String, Integer> chocolates = new TreeMap<>();
        chocolates.put("Milk Chocolate",0);
        chocolates.put("Dark Chocolate",0);
        chocolates.put("Baking Chocolate",0);
        for(double mil:m){
            milk.offer(mil);
        }
        for(double cac:c){
            cacao.push(cac);
        }
        while (!milk.isEmpty()&&!cacao.isEmpty()){
            double currentMilk = milk.peek();
            double currentCacao = cacao.peek();
            double sum = currentCacao+currentMilk;
            double percentage = currentCacao/sum*100;
            if(percentage==30){
                milk.poll();
                cacao.pop();
                chocolates.put("Milk Chocolate",chocolates.get("Milk Chocolate")+1);
            }
            else if(percentage==50){
                milk.poll();
                cacao.pop();
                chocolates.put("Dark Chocolate",chocolates.get("Dark Chocolate")+1);
            }
            else if(percentage==100){
                milk.poll();
                cacao.pop();
                chocolates.put("Baking Chocolate",chocolates.get("Baking Chocolate")+1);
            }
            else{
                cacao.pop();
                milk.offer(milk.poll()+10);
            }
        }
        chocolates.entrySet().removeIf(x->x.getValue()<1);
        if(chocolates.size()==3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }
        else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        for (Map.Entry<String, Integer> entry : chocolates.entrySet()) {
            System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
