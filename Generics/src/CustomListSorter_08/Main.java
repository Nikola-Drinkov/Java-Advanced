package CustomListSorter_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        CustomList<String> list = new CustomList<>();
        while (!command.equals("END")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case"Add":
                    String toAdd = commandArr[1];
                    list.add(toAdd);
                    break;
                case"Remove":
                    int index = Integer.parseInt(commandArr[1]);
                    list.remove(index);
                    break;
                case"Contains":
                    String element = commandArr[1];
                    System.out.println(list.contains(element));
                    break;
                case"Swap":
                    int first = Integer.parseInt(commandArr[1]);
                    int second = Integer.parseInt(commandArr[2]);
                    list.swap(first,second);
                    break;
                case"Greater":
                    String greater = commandArr[1];
                    System.out.println(list.countGreaterThan(greater));
                    break;
                case"Max":
                    System.out.println(list.getMax());
                    break;
                case"Min":
                    System.out.println(list.getMin());
                    break;
                case"Print":
                    list.iterator().forEachRemaining(System.out::println);
                    break;
                case"Sort":
                    Sorter.sort(list);
                    break;
            }
            command = sc.nextLine();
        }
    }
}
