package SetsAndMaps;

import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> shopsMap = new TreeMap<>();
        LinkedHashMap<String, Double> productsMap = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("Revision")){
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);
            if(!shopsMap.containsKey(shop)){
                shopsMap.put(shop,new LinkedHashMap<>());
            }
            shopsMap.get(shop).put(product,price);
            if(!productsMap.containsKey(product)){
                productsMap.put(product,0.00);
            }
            productsMap.put(product,price);

            input = sc.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String,Double>> entry : shopsMap.entrySet()) {
            System.out.println(entry.getKey()+"->");
            for (Map.Entry<String, Double> doubleEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",doubleEntry.getKey(),doubleEntry.getValue());
            }

        }

    }
}
