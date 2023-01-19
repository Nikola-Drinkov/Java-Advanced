package SetsAndMaps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("end")){
            String[] inputArr = input.split(" ");
            String ip = inputArr[0].split("=")[1];
            String user = inputArr[2].split("=")[1];
            if(!data.containsKey(user)){
                data.put(user,new LinkedHashMap<>());
            }
            LinkedHashMap<String, Integer> currentIps = data.get(user);
            if(!currentIps.containsKey(ip)){
                currentIps.put(ip,1);
            }
            else currentIps.put(ip,currentIps.get(ip)+1);
           input = sc.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : data.entrySet()) {
            System.out.println(entry.getKey()+": ");
            LinkedHashMap<String, Integer> currentIp = entry.getValue();
            int current = currentIp.size();
            for(String ip:currentIp.keySet()){
                if(current==1) {
                    System.out.printf("%s => %d.%n",ip,currentIp.get(ip));
                }
                else System.out.printf("%s => %d, ",ip,currentIp.get(ip));
                current--;
            }
        }
    }
}
