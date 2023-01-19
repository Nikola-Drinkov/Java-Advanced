package SetsAndMaps_Exercise;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeSet<String> compounds = new TreeSet<>();
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            for (String comp:input){
                compounds.add(comp);
            }
        }
        compounds.forEach(petkan -> System.out.print(petkan+" "));
    }
}
