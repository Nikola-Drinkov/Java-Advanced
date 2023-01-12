package StacksAndQueues_Exercise;



import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean balanced = false;
        for(char bracket:s.toCharArray()){
            if(bracket=='('||bracket=='['||bracket=='{'){
                openBrackets.push(bracket);
            }
            else if(bracket==')'||bracket==']'||bracket=='}'){
                char lastOpen = '0';
                if(!openBrackets.isEmpty()) {
                     lastOpen = openBrackets.pop();
                }
                if(lastOpen=='('&&bracket==')'){
                    balanced = true;
                }
                else if(lastOpen=='['&&bracket==']'){
                    balanced=true;
                }
                else if(lastOpen=='{'&&bracket=='}'){
                    balanced=true;
                }
                else{
                    balanced = false;
                    break;
                }
            }
        }
        if(balanced){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
