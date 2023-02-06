package Threeuple;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3;i++){
            String[] arr = sc.nextLine().split(" ");
            switch (i){
                case 0:
                    String firstName = arr[0];
                    String lastName = arr[1];
                    String address = arr[2];
                    String town = arr[3];
                    Threeuple<String, String, String> tuple = new Threeuple<>(firstName+" "+lastName,address,town);
                    System.out.println(tuple);
                    break;
                case 1:
                    String name = arr[0];
                    int litres = Integer.parseInt(arr[1]);
                    String drunk = arr[2];
                    boolean bool = false;
                    if(drunk.equals("drunk")) bool = true;
                    Threeuple<String,Integer,Boolean> tuple2 = new Threeuple<>(name,litres,bool);
                    System.out.println(tuple2);
                    break;
                case 2:
                    String name23 = arr[0];
                    double num = Double.parseDouble(arr[1]);
                    String bank = arr[2];
                    Threeuple<String ,Double,String> tuple3 = new Threeuple<>(name23,num,bank);
                    System.out.println(tuple3);
                    break;
            }
        }
    }
}
