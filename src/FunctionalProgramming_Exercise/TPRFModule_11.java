package FunctionalProgramming_Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TPRFModule_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> guest = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        HashMap<String,Predicate<String>> predicateMap = new HashMap<>();
        String input = sc.nextLine();
        while (!input.equals("Print")){
            String[] commandParts = input.split(";");
            Predicate<String> predicate;
            String command = commandParts[0];
            String criteria = commandParts[1];
            String given = commandParts[2];
            if(criteria.equals("Starts with")){
                predicate = x->x.startsWith(given);
            }
            else if(criteria.equals("Ends with")){
                predicate = x->x.endsWith(given);
            }
            else if (criteria.equals("Length")){
                predicate = x->x.length()==Integer.parseInt(given);
            }
            else{
                predicate = x->x.contains(given);
            }
            if(command.equals("Add filter")){
                predicateMap.put(criteria+given,predicate);
            }
            else{
                predicateMap.remove(criteria+given);
            }
            input = sc.nextLine();
        }

        for (Map.Entry<String, Predicate<String>> entry : predicateMap.entrySet()) {
            guest.removeIf(entry.getValue());
        }
        guest.forEach(name-> System.out.print(name+" "));
    }
}
