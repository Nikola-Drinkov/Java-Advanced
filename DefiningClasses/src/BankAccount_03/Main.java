package BankAccount_03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final HashMap<Integer, BankAccount> accounts = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("End")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            switch (command){
                case"Create":
                    BankAccount account = new BankAccount();
                    int id = account.getId();
                    accounts.put(id,account);
                    System.out.printf("Account ID%d created%n",id);
                    break;
                case"Deposit":
                    int depositId = Integer.parseInt(commandParts[1]);
                    double amount = Double.parseDouble(commandParts[2]);
                    if (accounts.containsKey(depositId)){
                        accounts.get(depositId).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n",amount,depositId);
                    }
                    else{
                        System.out.println("Account does not exist");
                    }
                    break;
                case"SetInterest":
                    double interest = Double.parseDouble(commandParts[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case"GetInterest":
                    int getId = Integer.parseInt(commandParts[1]);
                    int years = Integer.parseInt(commandParts[2]);
                    if(accounts.containsKey(getId)){
                        System.out.printf("%.2f%n",accounts.get(getId).getInterestRate(years));
                    }
                    else{
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            input = sc.nextLine();
        }
    }
}
