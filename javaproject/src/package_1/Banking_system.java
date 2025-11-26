package package_1;

public class Banking_system
{

	public static void main(String[] args)
	{
		long balance=100000L;
		float intrest=15f;
		double finalbalance=balance+(balance*intrest/100);
		
		{
			System.out.println("final balance: "+finalbalance);
		}

	}

}
