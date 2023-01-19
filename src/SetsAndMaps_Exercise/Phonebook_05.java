package SetsAndMaps_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("search")){
            String[] inputArr = input.split("-");
            String name = inputArr[0];
            String number = inputArr[1];
            phonebook.put(name,number);
            input = sc.nextLine();
        }
        String input2 = sc.nextLine();
        while (!input2.equals("stop")){
            String forSearch = input2;
            if(phonebook.containsKey(forSearch)){
                System.out.println(forSearch+" -> "+phonebook.get(forSearch));
            }
            else{
                System.out.println("Contact "+forSearch+" does not exist.");
            }
            input2 = sc.nextLine();
        }
    }
}
