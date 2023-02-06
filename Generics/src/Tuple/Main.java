package Tuple;

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
                    Tuple<String, String> tuple = new Tuple<>(firstName+" "+lastName,address);
                    System.out.println(tuple);
                    break;
                case 1:
                    String name = arr[0];
                    int litres = Integer.parseInt(arr[1]);
                    Tuple<String,Integer> tuple2 = new Tuple<>(name,litres);
                    System.out.println(tuple2);
                    break;
                case 2:
                    int num = Integer.parseInt(arr[0]);
                    double num2 = Double.parseDouble(arr[1]);
                    Tuple<Integer,Double> tuple3 = new Tuple<>(num,num2);
                    System.out.println(tuple3);
                    break;
            }
        }
    }
}
