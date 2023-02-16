package ExamPrep;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mal = sc.nextLine().split(" ");
        String[] fem = sc.nextLine().split(" ");
        ArrayDeque<Integer> males = new ArrayDeque<>();
        ArrayDeque<Integer> females = new ArrayDeque<>();
        for(String m:mal) males.push(Integer.parseInt(m));
        for(String f:fem) females.offer(Integer.parseInt(f));
        int matches = 0;

        while (!males.isEmpty()&&!females.isEmpty()){
            int curMale = males.peek();
            int curFem = females.peek();

            if(curMale<=0)
                males.pop();
            else if(curFem<=0)
                females.poll();
            else if(curMale%25==0){
                males.pop();
                males.pop();
            }
            else if(curFem%25==0){
                females.poll();
                females.poll();
            }
            else if(curMale==curFem){
                matches++;
                males.pop();
                females.poll();
            }
            else{
                females.poll();
                males.push(males.pop()-2);
            }
        }
        System.out.println("Matches: "+matches);
        if(males.isEmpty()) {
            System.out.println("Males left: none");
        }
        else {
            System.out.print("Males left: ");
            System.out.println(males.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
        if(females.isEmpty()) {
            System.out.println("Females left: none");
        }
        else {
            System.out.print("Females left: ");
            System.out.println(females.stream().map(x->x.toString()).collect(Collectors.joining(", ")));
        }
    }
}
