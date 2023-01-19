package SetsAndMaps_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            set.add(sc.nextLine());
        }
        for (String username:set){
            System.out.println(username);
        }
    }
}
