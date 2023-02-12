package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DATURA_BOMB = 40;
        final int CHERRY_BOMB = 60;
        final int SMOKE_DECOY = 120;

        String[] effectsArr = sc.nextLine().split(", ");
        String[] casingArr = sc.nextLine().split(", ");
        ArrayDeque<Integer> effects = new ArrayDeque<>();
        ArrayDeque<Integer> casings = new ArrayDeque<>();
        Arrays.stream(effectsArr).forEach(x->effects.offer(Integer.parseInt(x)));
        Arrays.stream(casingArr).forEach(x->casings.push(Integer.parseInt(x)));

        int daturaCount = 0;
        int cherryCount = 0;
        int smokeCount = 0;
        boolean all = false;

        while (!effects.isEmpty()&&!casings.isEmpty()){
            if(daturaCount>=3&&cherryCount>=3&&smokeCount>=3){
                all = true;
                break;
            }
            int curEffect = effects.peek();
            int curCasing = casings.peek();
            int sum = curCasing+curEffect;
            if(sum==DATURA_BOMB){
                daturaCount++;
                effects.poll();
                casings.pop();
            }
            else if (sum==CHERRY_BOMB) {
                cherryCount++;
                effects.poll();
                casings.pop();
            }
            else if(sum==SMOKE_DECOY){
                smokeCount++;
                effects.poll();
                casings.pop();
            }
            else{
                casings.push(casings.pop()-5);
            }
        }
        if(all) System.out.println("Bene! You have successfully filled the bomb pouch!");
        else System.out.println("You don't have enough materials to fill the bomb pouch.");
        if(!effects.isEmpty()){
            System.out.print("Bomb Effects: ");
            System.out.println(effects.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
        else{
            System.out.println("Bomb Effects: empty");
        }
        if(!casings.isEmpty()){
            System.out.print("Bomb Casings: ");
            System.out.println(casings.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
        else{
            System.out.println("Bomb Casings: empty");
        }
        System.out.println("Cherry Bombs: "+cherryCount);
        System.out.println("Datura Bombs: "+daturaCount);
        System.out.println("Smoke Decoy Bombs: "+smokeCount);
    }
}
