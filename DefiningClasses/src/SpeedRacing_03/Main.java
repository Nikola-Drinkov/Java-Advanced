package SpeedRacing_03;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,Car> carsMap = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCostFor1 = Double.parseDouble(input[2]);
            Car car = new Car(model,fuelAmount,fuelCostFor1);
            carsMap.put(model,car);
        }
        String input = sc.nextLine();
        while (!input.equals("End")){
            String[] inputArr = input.split("\\s+");
            String carModel = inputArr[1];
            int amountOfKm = Integer.parseInt(inputArr[2]);
            carsMap.get(carModel).Drive(carModel,amountOfKm);
            input = sc.nextLine();
        }
        for(Car car:carsMap.values()){
            System.out.println(car);
        }
    }
}
