package SetsAndMaps_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSize = sc.nextInt();
        int secondSize = sc.nextInt();
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
        for(int i=0; i<firstSize; i++){
            firstSet.add(sc.nextInt());
        }
        for(int i=0; i<secondSize; i++){
            secondSet.add(sc.nextInt());
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(petkan -> System.out.print(petkan+" "));
    }
}
