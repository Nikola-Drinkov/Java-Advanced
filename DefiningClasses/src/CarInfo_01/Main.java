package CarInfo_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            String brand = input[0];
            String model = input[1];
            int hp = Integer.parseInt(input[2]);
            Car car = new Car(brand,model,hp);
            System.out.println(car.carInfo());
        }
    }
}
