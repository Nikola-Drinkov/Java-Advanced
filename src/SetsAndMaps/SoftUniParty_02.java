package SetsAndMaps;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> guests = new TreeSet<>();

        String input = sc.nextLine();
        while (!input.equals("PARTY")){
            guests.add(input);
            input = sc.nextLine();
        }
        String input2 = sc.nextLine();
        while (!input2.equals("END")){
            guests.remove(input2);
            input2 = sc.nextLine();
        }
        System.out.println(guests.size());
        for (String guest:guests){
            System.out.println(guest);
        }
    }
}