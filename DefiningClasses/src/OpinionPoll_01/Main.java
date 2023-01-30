package OpinionPoll_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Person> peopleMap = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] inpArr = sc.nextLine().split("\\s+");
            String name = inpArr[0];
            int age = Integer.parseInt(inpArr[1]);
            if(age>30) {
                Person person = new Person(name, age);
                peopleMap.put(name, person);
            }
        }
        for (Map.Entry<String, Person> entry : peopleMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }

    }
}
