package CarConstructors_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            String brand = input[0];
            Car car;
            if(input.length>1) {
                String model = input[1];
                int hp = Integer.parseInt(input[2]);
                car = new Car(brand, model, hp);
            }
            else{
                 car = new Car(brand);
            }
            System.out.println(car.carInfo());
        }
    }
}
