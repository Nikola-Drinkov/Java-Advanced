package SetsAndMaps;

import java.util.*;

public class AverageStudentsGrad_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        TreeMap<String, List<Double>> grades = new TreeMap<>();
        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split("\\s+");
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);
            if(!grades.containsKey(name)){
                grades.put(name, new ArrayList<>());
                grades.get(name).add(grade);
            }
            else{
                grades.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            double sum = 0.00;
            System.out.print(entry.getKey()+" -> ");
            for (Double grade:entry.getValue()){
                System.out.printf("%.2f ",grade);
                sum+=grade;
            }
            double average = sum/entry.getValue().size();
            System.out.printf("(avg: %.2f)%n",average);
        }

    }
}
