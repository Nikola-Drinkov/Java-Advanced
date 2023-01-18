package SetsAndMaps;

import java.util.*;

public class CitiesByContinent_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n;i++){
            String[] tokens = sc.nextLine().split(" ");
            String cont = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            if(!map.containsKey(cont)){
                map.put(cont,new LinkedHashMap<>());
            }
            if(!map.get(cont).containsKey(country)){
                map.get(cont).put(country,new ArrayList<>());
            }
            map.get(cont).get(country).add(city);
        }
        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":");
            for (Map.Entry<String, List<String>> listEntry : entry.getValue().entrySet()) {
                System.out.print("  "+listEntry.getKey()+" -> ");
                System.out.println(String.join(", ",listEntry.getValue()));
            }
        }
    }
}
