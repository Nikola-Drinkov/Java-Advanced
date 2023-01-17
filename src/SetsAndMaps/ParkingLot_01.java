package SetsAndMaps;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashSet<String> parking = new LinkedHashSet<>();
        while (!input.equals("END")){
            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String car = tokens[1];
            if(direction.equals("IN")){
                parking.add(car);
            }
            else if(direction.equals("OUT")){
                parking.remove(car);
            }
            input = sc.nextLine();
        }
        if(!parking.isEmpty())
        parking.forEach(car -> System.out.println(car));
        else System.out.println("Parking Lot is Empty");
    }
}
