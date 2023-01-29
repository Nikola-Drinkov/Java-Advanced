package FunctionalProgramming_Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> guests = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("Party!")){
            Predicate<String> predicate = null;
            String[] commandArr = command.split(" ");
            String commandName = commandArr[0];
            String criteria = commandArr[1];
            String given = commandArr[2];
            if(criteria.equals("StartsWith")){
                predicate = x->x.startsWith(given);
            }
            else if(criteria.equals("EndsWith")){
                predicate = x->x.endsWith(given);
            }
            else{
                predicate = x->x.length()==Integer.parseInt(given);
            }

            if(commandName.equals("Remove")){
                List<String> toRemove = new ArrayList<>();
                for(String guest:guests){
                    if(predicate.test(guest)) toRemove.add(guest);
                }
                guests.removeAll(toRemove);
            }
            else if(commandName.equals("Double")){
                List<String> toDouble = new ArrayList<>();
                for(String guest:guests){
                    if(predicate.test(guest)) toDouble.add(guest);
                }
                guests.addAll(toDouble);
            }
            command = sc.nextLine();
        }
        Collections.sort(guests);
        if(guests.size()>0) {
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }
        else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
