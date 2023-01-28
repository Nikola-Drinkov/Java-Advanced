package BankAccount_03;

public class BankAccount {
    private int Id;
    private double Balance;
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;

    public BankAccount() {
        this.Id = bankAccountCount++;
        this.Balance = 0;
    }
    static void setInterestRate(double interest){
        interestRate=interest;
    }
    void deposit(double amount){
        this.Balance += amount;
    }

    double getInterestRate(int years) {
        return BankAccount.interestRate*years*this.Balance;
    }

    public int getId() {
        return Id;
    }
}
