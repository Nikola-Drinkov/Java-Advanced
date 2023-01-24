package ExamPrepStacksQueues;

import java.util.*;

public class ClimbThePeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foodArr = sc.nextLine().split(", ");
        String[] staminaArr = sc.nextLine().split(", ");
        ArrayDeque<Integer> foodStack = new ArrayDeque<>();
        ArrayDeque<Integer> staminaQueue = new ArrayDeque<>();
        for(String food:foodArr){
            foodStack.push(Integer.parseInt(food));
        }
        for(String stamina:staminaArr){
            staminaQueue.offer(Integer.parseInt(stamina));
        }
        ArrayDeque<String> peaks = new ArrayDeque<>();
        peaks.push("Kamenitza");
        peaks.push("Polezhan");
        peaks.push("Banski Suhodol");
        peaks.push("Kutelo");
        peaks.push("Vihren");
        LinkedHashMap<String, Integer> peaksMap = new LinkedHashMap<>();
        peaksMap.put("Vihren",80);
        peaksMap.put("Kutelo",90);
        peaksMap.put("Banski Suhodol",100);
        peaksMap.put("Polezhan",60);
        peaksMap.put("Kamenitza",70);
        List<String> conquered = new ArrayList<>();

        while (!peaksMap.isEmpty()&&!foodStack.isEmpty()&&!staminaQueue.isEmpty()){
            int currentSum = foodStack.peek()+staminaQueue.peek();
            String currentPeak = peaks.peek();
            int currentDiff = peaksMap.get(currentPeak);
            if(currentSum>=currentDiff){
                foodStack.pop();
                staminaQueue.poll();
                peaks.pop();
                peaksMap.remove(currentPeak);
                conquered.add(currentPeak);
            }
            else{
                foodStack.pop();
                staminaQueue.poll();
            }
        }

        if(peaksMap.isEmpty()){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        }
        else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }

        if(!conquered.isEmpty()){
            System.out.println("Conquered peaks:");
            for(String peak:conquered){
                System.out.println(peak);
            }
        }
    }
}
