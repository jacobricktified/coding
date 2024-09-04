public class BankAccount {
    public int balance = 0;
    public int deposit(int amount ){
        balance = amount + balance;
        return 0;
    }
    public int withdraw (int amount){
        balance = balance - amount;
        return 0;
    }

    public static void main(String[] args){
        System.out.println("Wellcome to bank account method");

    }
}
