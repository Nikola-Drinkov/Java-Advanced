package SetsAndMaps;

import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, double[]> grades = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            double[] gradesIn = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            grades.put(name,gradesIn);
        }
        for (Map.Entry<String, double[]> entry : grades.entrySet()) {
            double sum = 0.00;
            double average = 0.00;
            for(double grade:grades.get(entry.getKey())){
                sum+=grade;
            }
            average=sum/grades.get(entry.getKey()).length;
            System.out.printf("%s is graduated with %f%n",entry.getKey(),average);
        }
    }
}
