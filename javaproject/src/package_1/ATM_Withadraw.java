package package_1;
import java.util.Scanner;

public class ATM_Withadraw
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		double Currentbalance=54440.53;
		System.out.println("ATM withdraw");
		System.out.println("Your balance: "+Currentbalance);
		int limit=30000;
		System.out.println("Withdraw limit per day 30000 ");
		System.out.println("Enter amount to be withdrawn: ");
		int withdraw =scan.nextInt();
		double balance;
		if(withdraw<=Currentbalance && withdraw<=limit)
		
		{
			System.out.println("withdraw Successfully");
			
		}
		else if(withdraw>Currentbalance)
	          System.out.println("Withdraw failed Insufficient balance");
		
		else if(withdraw>limit)
		{
			System.out.println("Withdraw failed withdraw limit is 30000");
		}
		
	

	}

}
//.Write a program for ATM withdrawal:

//3.1.Check balance

//3.2.Then check if amount ≤ limit