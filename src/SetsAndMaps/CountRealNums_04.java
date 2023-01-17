package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNums_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double,Integer> numsMap = new LinkedHashMap<>();
        for (Double num:input){
            if(!numsMap.containsKey(num))
                numsMap.put(num,1);
            else numsMap.put(num,numsMap.get(num)+1);
        }
        for (Map.Entry<Double, Integer> entry : numsMap.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
