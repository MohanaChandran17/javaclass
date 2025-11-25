package package_1;

public class Calculator
{
	public static void main(String args[])
	{
		long balance = 150000L;   
		float interest = balance  / 100;
        float finalBalance = balance + interest;

        System.out.println("Balance: " + balance);
        System.out.println("Interest Amount: " + interest);
        System.out.println("Final Balance: " + finalBalance);
    }

		
	}


