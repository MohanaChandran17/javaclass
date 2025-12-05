package package_1;
import java.util.Scanner;
class BankAccount
{
	int accountNumber;
	double balance;
	
	BankAccount(int accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	void deposite(double amount)
	{
		    balance=balance+amount;
	}
	void withdraw(double withdrawAmount)
	
	{
		balance=balance-withdrawAmount;
		if(withdrawAmount<=balance)
		{
			System.out.println("Withdrawn Succesfully");
		}
		else
		{
			System.out.println("Influent balance");
		}
		
	}
	
}
class SavingsAccount extends BankAccount
{
	double interestrate;
	 SavingsAccount (int accountNumber,double balance,double interestrate)
	{
		 super(accountNumber, balance);
         this.interestrate=interestrate;
	}
	
	
	double calculateInterest()
	{
	      return balance*(interestrate/100);
	}
}


public class InheritanceBank
{
	
	public static void main(String[] args)
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter accNumber: ");
		 int accountNumber=scan.nextInt();
		 System.out.print("Enter balance: ");
		 double balance=scan.nextDouble();
		 System.out.print("Enter depsite amount: ");
		 double amount=scan.nextDouble();
		 System.out.print("Enter withdraw amount: ");
		 double withdrawAmount=scan.nextDouble();
		 System.out.print("Enter interest rate: ");
		 double interestrate=scan.nextDouble();
		 
		 
		 SavingsAccount obj1=new  SavingsAccount(accountNumber,balance,interestrate);
		 obj1.deposite(amount);
		 obj1.withdraw(withdrawAmount);
		double intrest= obj1.calculateInterest();
		System.out.println("---------------------------- ");
		System.out.println("Calculated Interest: " + intrest);
		System.out.println("Final Balance is " + obj1.balance);
		

	}

}
