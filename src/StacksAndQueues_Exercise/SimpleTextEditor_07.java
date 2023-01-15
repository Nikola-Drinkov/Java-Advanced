package StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> textStack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] command = sc.nextLine().split("\\s+");
            switch (command[0]){
                case"1":
                    textStack.push(text.toString());
                    String str = command[1];
                    text.append(str);
                    break;
                case"2":
                    textStack.push(text.toString());
                    int count = Integer.parseInt(command[1]);
                    text.delete(text.length()-count,text.length());
                    break;
                case"3":
                    int position = Integer.parseInt(command[1]);
                    System.out.println(text.charAt(position-1));
                    break;
                case"4":
                    if(!textStack.isEmpty()){
                        text = new StringBuilder(textStack.pop());
                    }
                    break;
            }

        }
    }
}
