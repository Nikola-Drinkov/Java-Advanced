package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> st = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> car = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> steel = new ArrayDeque<>();
        ArrayDeque<Integer> carbon = new ArrayDeque<>();
        TreeMap<String,Integer> swords = new TreeMap<>();
        swords.put("Gladius",0);
        swords.put("Shamshir",0);
        swords.put("Katana",0);
        swords.put("Sabre",0);
        for(int s:st){
            steel.offer(s);
        }
        for (int c:car){
            carbon.push(c);
        }
        int totalSwords=0;
        while (!steel.isEmpty()&&!carbon.isEmpty()){
            int currentSteel = steel.peek();
            int currentCarbon = carbon.peek();
            int sum = currentCarbon+currentSteel;
            if(sum==70){
                totalSwords++;
                swords.put("Gladius",swords.get("Gladius")+1);
                steel.poll();
                carbon.pop();
            }
            else if(sum==80){
                totalSwords++;
                swords.put("Shamshir",swords.get("Shamshir")+1);
                steel.poll();
                carbon.pop();
            }
            else if(sum==90){
                totalSwords++;
                swords.put("Katana",swords.get("Katana")+1);
                steel.poll();
                carbon.pop();
            }
            else if(sum==110){
                totalSwords++;
                swords.put("Sabre",swords.get("Sabre")+1);
                steel.poll();
                carbon.pop();
            }
            else{
                steel.poll();
                carbon.push(carbon.pop()+5);
            }
        }
        swords.entrySet().removeIf(x->x.getValue()==0);
        if(swords.size()>0){
            System.out.printf("You have forged %d swords.%n",totalSwords);
        }
        else{
            System.out.printf("You did not have enough resources to forge a sword.%n");
        }
        if(!steel.isEmpty()){
            System.out.print("Steel left: ");
            while (steel.size()>1) System.out.print(steel.poll()+", ");
            System.out.println(steel.poll());
        }
        else{
            System.out.println("Steel left: none");
        }
        if(!carbon.isEmpty()){
            System.out.print("Carbon left: ");
            while (carbon.size()>1) System.out.print(carbon.pop()+", ");
            System.out.println(carbon.pop());
        }
        else{
            System.out.println("Carbon left: none");
        }
        for (Map.Entry<String, Integer> entry : swords.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

    }
}
