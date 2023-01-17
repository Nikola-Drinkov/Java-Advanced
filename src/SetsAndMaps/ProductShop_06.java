package SetsAndMaps;

import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, List<String>> shopsMap = new TreeMap<>();
        LinkedHashMap<String, Double> productsMap = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("Revision")){
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);
            if(!shopsMap.containsKey(shop)){
                shopsMap.put(shop,new ArrayList<>());
            }
            shopsMap.get(shop).add(product);
            if(!productsMap.containsKey(product)){
                productsMap.put(product,0.00);
            }
            productsMap.put(product,price);

            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : shopsMap.entrySet()) {
            System.out.println(entry.getKey()+"->");
            for(String product: entry.getValue()){
                System.out.printf("Product: %s, Price: %.1f%n",product,productsMap.get(product));
            }
        }

    }
}
