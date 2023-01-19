package SetsAndMaps_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmail_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashMap<String, String> emailsMap = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String name = input;
            String email = sc.nextLine();
           emailsMap.put(name,email);
            input = sc.nextLine();
        }
        emailsMap.entrySet().removeIf(entry -> entry.getValue().endsWith("uk")||
                                                entry.getValue().endsWith("us")||
                                                entry.getValue().endsWith("com"));
        emailsMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
