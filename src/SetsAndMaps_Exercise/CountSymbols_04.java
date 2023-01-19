package SetsAndMaps_Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character,Integer> symbolsMap = new TreeMap<>();
        String input = sc.nextLine();
        char [] symbolsArr = input.toCharArray();
        for(char symbol:symbolsArr){
            if(!symbolsMap.containsKey(symbol)){
                symbolsMap.put(symbol,1);
            }
            else symbolsMap.put(symbol,symbolsMap.get(symbol)+1);
        }
        for (Map.Entry<Character, Integer> entry : symbolsMap.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
