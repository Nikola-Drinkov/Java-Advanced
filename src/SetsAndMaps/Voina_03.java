package SetsAndMaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstPlayer = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondPlayer = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LinkedHashSet<Integer> firstPlayerCards = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayerCards = new LinkedHashSet<>();
        for(int i=0; i<firstPlayer.length; i++){
            firstPlayerCards.add(firstPlayer[i]);
            secondPlayerCards.add(secondPlayer[i]);
        }
        int steps = 0;
        while(!secondPlayerCards.isEmpty()&&!firstPlayerCards.isEmpty()) {
            if(steps>=50) break;

            int firstNum = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNum);
            int secondNum = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNum);

            if (firstNum>secondNum){
                firstPlayerCards.add(firstNum);
                firstPlayerCards.add(secondNum);
            }
            else if(firstNum<secondNum){
                secondPlayerCards.add(firstNum);
                secondPlayerCards.add(secondNum);
            }
            steps++;
        }
        if(firstPlayerCards.isEmpty()||firstPlayerCards.size()<secondPlayerCards.size())
            System.out.println("Second player win!");
        else if(secondPlayerCards.isEmpty()||firstPlayerCards.size()>secondPlayerCards.size())
            System.out.println("First player win!");
        else System.out.println("Draw!");
    }
}
