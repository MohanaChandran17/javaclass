package package_1;
import java.util.Scanner;

public class Bank
{
	static class BankAccount 
    {
        private int accountNumber;
        private double balance;

        public int getAccountNumber() 
        {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) 
        {
            this.accountNumber = accountNumber;
        }

        public double getBalance()
        {
            return balance;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.print("Enter Account Number: ");
        int accNum = scan.nextInt();
        obj.setAccountNumber(accNum);
        System.out.print("Enter Balance: ");
        double bal = scan.nextDouble();
        obj.setBalance(bal);
        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Balance: " + obj.getBalance());

    }
}
